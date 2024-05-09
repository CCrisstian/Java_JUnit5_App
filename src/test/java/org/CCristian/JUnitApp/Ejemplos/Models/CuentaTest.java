package org.CCristian.JUnitApp.Ejemplos.Models;

import org.CCristian.JUnitApp.Ejemplos.Exceptions.DineroInsuficiente_Exception;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.math.BigDecimal;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.*;


class CuentaTest {

    Cuenta cuenta;

    @BeforeEach
    void initMetodoTest(){
        this.cuenta = new Cuenta("Cristian", new BigDecimal("1000.12345"));
        System.out.println("Iniciando el método");
    }

    @AfterEach
    void tearDown() {System.out.println("Finalizando el método de prueba");}

    @BeforeAll
    static void beforeAll() {System.out.println("\t\t\tInicializando el test");}

    @AfterAll
    static void afterAll() {System.out.println("\t\t\tFinalizando el test");}

    @Nested
    @DisplayName("Probando atributos de la cuenta corriente")
    class CuentaTestNombreSaldo{
        @Test
        @DisplayName("el nombre ")
        void test_NombreCuenta() {    /*Verifica que el valor del atributo 'persona' sea igual a 'Cristian'*/
//        cuenta.setPersona("Cristian");
            String esperado = "Cristian";
            String real = cuenta.getPersona();
            assertNotNull(real, () -> "La Cuenta no puede ser nula");
            assertEquals(esperado, real, () -> "El nombre de la cuenta no es el que se esperaba: se esperaba '"+esperado+"' sin embargo fue '"+real+"'");
            assertTrue(real.equals("Cristian"), () -> "El nombre de la cuenta esperada debe ser igual al real");
        }

        @Test
        @DisplayName("el saldo, que no sea null, mayor que 0 y valor esperado")
        void test_SaldoCuenta() {     /*Verifica que el valor del atributo 'persona' sea igual a 'Cristian'*/
            assertNotNull(cuenta.getSaldo());   /*Verifica que el atributo 'saldo' no sea 'null'*/
            assertEquals(1000.12345, cuenta.getSaldo().doubleValue());  /*Verifica que el valor del atributo 'saldo' sea igual a '1000.12345'*/
            assertFalse(cuenta.getSaldo().compareTo(BigDecimal.ZERO) < 0);  /*Verifica que el valor del atributo 'saldo' no sea menor a '0'*/
            assertTrue(cuenta.getSaldo().compareTo(BigDecimal.ZERO) > 0);   /*Verifica que el valor del atributo 'saldo' sea mayor a '0'*/
        }

        @Test
        @DisplayName("Testeando referencias que sean iguales con el método 'equals'")
        void test_ReferenciaCuenta() {
            cuenta = new Cuenta("John Doe", new BigDecimal("8900.9997"));
            Cuenta cuenta_2 = new Cuenta("John Doe", new BigDecimal("8900.9997"));
//        assertNotEquals(cuenta2, cuenta);     /*Compara por INSTANCIA*/
            assertEquals(cuenta_2, cuenta);         /*Compara por VALOR*/
        }
    }

    @Nested
    class CuentaOperacionesTest{
        @Test
        void test_DebitoCuenta() {   /*Verifica que se pueda realizar el método 'debito'*/
            cuenta.debito(new BigDecimal(100)); /*Se debitan '100' del valor del atributo 'saldo'*/
            assertNotNull(cuenta.getSaldo());   /*Verifica que el atributo 'saldo' no sea 'null'*/
            assertEquals(900, cuenta.getSaldo().intValue());    /*Verifica que sea haya 'debitado' correctamente solo incluyendo el valor entero*/
            /*cuenta.getSaldo().intValue()) --> devuelve la parte entera del número*/
            assertEquals("900.12345", cuenta.getSaldo().toPlainString());   /*Verifica que sea haya 'debitado' correctamente incluyendo decimales*/
        }

        @Test
        void test_CreditoCuenta() {   /*Verifica que se pueda realizar el método 'credito'*/
            cuenta.credito(new BigDecimal(100)); /*Se acreditan '100' al valor del atributo 'saldo'*/
            assertNotNull(cuenta.getSaldo());   /*Verifica que el atributo 'saldo' no sea 'null'*/
            assertEquals(1100, cuenta.getSaldo().intValue());    /*Verifica que sea haya 'acreditado' correctamente solo incluyendo el valor entero*/
            /*cuenta.getSaldo().intValue()) --> devuelve la parte entera del número*/
            assertEquals("1100.12345", cuenta.getSaldo().toPlainString());   /*Verifica que sea haya 'acreditado' correctamente incluyendo decimales*/
        }

        @Test
        void test_transferirDineroCuentas() {
            Cuenta cuenta_1 = new Cuenta("Jhon Doe", new BigDecimal("2500"));
            Cuenta cuenta_2 = new Cuenta("Cristian", new BigDecimal("1500.8989"));
            Banco banco = new Banco();
            banco.setNombre("Banco del Estado");
            banco.transferir(cuenta_2, cuenta_1, new BigDecimal(500));
            assertEquals("1000.8989", cuenta_2.getSaldo().toPlainString());
            assertEquals("3000", cuenta_1.getSaldo().toPlainString());
        }
    }


    @Test
    void test_DineroInsuficienteExceptionCuenta() {  /*Verifica como se maneja el error en caso de que haya 'saldo' insuficiente*/
        Exception exception = assertThrows(DineroInsuficiente_Exception.class, () -> cuenta.debito(new BigDecimal(1500)));
        String mensajeActual = exception.getMessage();
        String mensajeEsperado = "Dinero Insuficiente";
        assertEquals(mensajeEsperado, mensajeActual);
    }


    @Test
    @DisplayName("Probando relaciones entre las Cuentas y el Banco con 'assertAll'.")
    //@Disabled
    void test_RelacionBancoCuentas() {  /*Verifica las siguientes relaciones*/
        Cuenta cuenta_1 = new Cuenta("Jhon Doe", new BigDecimal("2500"));
        Cuenta cuenta_2 = new Cuenta("Cristian", new BigDecimal("1500.8989"));
        Banco banco = new Banco();
        banco.addCuenta(cuenta_1);
        banco.addCuenta(cuenta_2);
        banco.setNombre("Banco del Estado");
        banco.transferir(cuenta_2, cuenta_1, new BigDecimal(500));
        assertAll(
                () -> assertEquals("1000.8989", cuenta_2.getSaldo().toPlainString(), () -> "El valor del saldo de la cuenta_2 no es el esperado"),
                () -> assertEquals("3000", cuenta_1.getSaldo().toPlainString(), () -> "El valor del saldo de la cuenta_1 no es el esperado"),
                () -> assertEquals(2, banco.getCuentas().size(), () -> "El banco no tiene las cuentas esperadas"), /*Banco → Muchas → Cuentas*/
                () -> assertEquals("Banco del Estado", cuenta_1.getBanco().getNombre()),  /*Cuenta_1 → Solo un → Banco*/
                () -> assertEquals("Cristian", banco.getCuentas() /*Cuenta → Solo un → Banco*/
                                                            .stream()   /*Convertir 'List' en un tipo 'Stream'*/
                                                            .filter(cuenta -> cuenta.getPersona().equals("Cristian"))   /*Filtrar la cuentas*/
                                                            .findFirst()    /*Encontrar la primera 'cuenta' del 'Stream'*/
                                                            .get().getPersona()),  /*Obtener el valor del atributo 'persona' de la 'cuenta'*/
                () -> assertTrue(banco.getCuentas().stream().anyMatch(cuenta -> cuenta.getPersona().equals("Jhon Doe")))
        );
    }

    @Nested
    class SistemaOperativoTest{
        @Test
        @EnabledOnOs(OS.WINDOWS)
        void testSoloWindows(){}

        @Test
        @EnabledOnOs({OS.LINUX, OS.MAC})
        void testSoloLinuxMac(){}

        @Test
        @DisabledOnOs(OS.WINDOWS)
        void testNoWindows(){}
    }

    @Nested
    class  JavaVersionTest{
        @Test
        @EnabledOnJre(JRE.JAVA_8)
        void soloJdk8(){}

        @Test
        @EnabledOnJre(JRE.JAVA_21)
        void soloJdk21(){}

        @Test
        @DisabledOnJre(JRE.JAVA_21)
        void testNoJdk21(){}
    }

    @Nested
    class SystemPropertiesTest{
        @Test
        void imprimirSystemProperties(){
            Properties properties = System.getProperties();
            properties.forEach((k, v) -> System.out.println(k + " : " + v));
        }

        @Test
        @EnabledIfSystemProperty(named = "java.version", matches = ".*21.*")
        void testJavaVersion(){}

        @Test
        @DisabledIfSystemProperty(named = "os.arch", matches = ".*32.*")
        void testSolo64() {
        }

        @Test
        @EnabledIfSystemProperty(named = "os.arch", matches = ".*32.*")
        void testNo64() {
        }

        @Test
        @EnabledIfSystemProperty(named = "user.name", matches = "criss")
        void testUsername() {
        }

        @Test
        @EnabledIfSystemProperty(named = "ENV", matches = "dev")
        void testDev() {
        }
    }

    @Nested
    class VariablesAmbienteTest{
        @Test
        void imprimirVariablesAmbiente() {
            Map<String, String> getenv = System.getenv();
            getenv.forEach((k, v) -> System.out.println(k + " = " + v));
        }

        @Test
        @EnabledIfEnvironmentVariable(named = "JAVA_HOME", matches = ".*jdk-19.*")
        void testJavaHomer(){}

        @Test
        @EnabledIfEnvironmentVariable(named = "NUMBER_OF_PROCCESORS", matches = "12")
        void testProcesadores(){}

        @Test
        @EnabledIfEnvironmentVariable(named = "ENVIRONMENT", matches = "dev")
        void testEnv() {}

        @Test
        @DisabledIfEnvironmentVariable(named = "ENVIRONMENT", matches = "prod")
        void testEnvProdDisabled() {}
    }

    @Test
    void test_SaldoCuentaDev() {    /*La prueba solo se ejecutará cuando el ambiente sea "dev"*/
        boolean esDev = "dev".equals(System.getProperty("ENV"));
        assumeTrue(esDev);
        /*Todo lo que esta debajo del "assumeTrue" se ejecuta si se cumple la condición*/
        assertNotNull(cuenta.getSaldo());
        assertEquals(1000.12345, cuenta.getSaldo().doubleValue());
        assertFalse(cuenta.getSaldo().compareTo(BigDecimal.ZERO) < 0);
        assertTrue(cuenta.getSaldo().compareTo(BigDecimal.ZERO) > 0);
    }

    @Test
    void test_SaldoCuentaDev_2() {
        boolean esDev = "dev".equals(System.getProperty("ENV"));
        assumingThat(esDev, () -> {         /*Todo lo que esta dentro del "assumingThat" se ejecuta si se cumple la condición*/
            assertNotNull(cuenta.getSaldo());
            assertEquals(1000.12345, cuenta.getSaldo().doubleValue());
        });
        /*Todo lo que esta fuera del "assumingThat" se ejecuta sin importar si la condición se cumple*/
        assertFalse(cuenta.getSaldo().compareTo(BigDecimal.ZERO) < 0);
        assertTrue(cuenta.getSaldo().compareTo(BigDecimal.ZERO) > 0);
    }

    @DisplayName("Probando Debito Cuenta Repetir! ")
    @RepeatedTest(value = 5, name = "{displayName} - Repetición nro {currentRepetition} de {totalRepetitions}")
    void testDebitoCuenta_Repetir(RepetitionInfo info) {
        if (info.getCurrentRepetition() == 3){
            System.out.println("\nEstamos en la repetición nro --> " + info.getCurrentRepetition() + "\n");
        }
        cuenta.debito(new BigDecimal(100));
        assertNotNull(cuenta.getSaldo());
        assertEquals(900, cuenta.getSaldo().intValue());
        assertEquals("900.12345", cuenta.getSaldo().toPlainString());
    }

    @ParameterizedTest(name = "nro {index} ejecutando con valor {0}")
    @ValueSource(strings = {"100", "200", "300", "500", "700", "1000.12345"})
    void testDebitoCuenta_ValueSource(String monto) {
        cuenta.debito(new BigDecimal(monto));
        assertNotNull(cuenta.getSaldo());
        assertTrue(cuenta.getSaldo().compareTo(BigDecimal.ZERO) > 0);
    }

    @ParameterizedTest(name = "nro {index} ejecutando con valor {0}")
    @CsvSource({"1,100", "2,200", "3,300", "4,500", "5,700", "6,1000.12345"})
    void testDebitoCuenta_CsvSource(String index, String monto) {
        System.out.println(index + " --> " + monto);
        cuenta.debito(new BigDecimal(monto));
        assertNotNull(cuenta.getSaldo());
        assertTrue(cuenta.getSaldo().compareTo(BigDecimal.ZERO) > 0);
    }

    @ParameterizedTest(name = "nro {index} ejecutando con valor {0}")
    @CsvFileSource(resources = "/data.csv")
    void testDebitoCuenta_CsvFileSource(String monto) {
        cuenta.debito(new BigDecimal(monto));
        assertNotNull(cuenta.getSaldo());
        assertTrue(cuenta.getSaldo().compareTo(BigDecimal.ZERO) > 0);
    }

    static List<String> montoList(){
        return Arrays.asList("100", "200", "300", "500", "700", "1000.12345");
    }

    @ParameterizedTest(name = "nro {index} ejecutando con valor {0}")
    @MethodSource("montoList")
    void testDebitoCuenta_MethodSource(String monto) {
        cuenta.debito(new BigDecimal(monto));
        assertNotNull(cuenta.getSaldo());
        assertTrue(cuenta.getSaldo().compareTo(BigDecimal.ZERO) > 0);
    }
}