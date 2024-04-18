package org.CCristian.JUnitApp.Ejemplos.Models;

import org.CCristian.JUnitApp.Ejemplos.Exceptions.DineroInsuficiente_Exception;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;
import static org.junit.jupiter.api.Assertions.*;

class CuentaTest {

    @Test
    void test_NombreCuenta(){    /*Verifica que el valor del atributo 'persona' sea igual a 'Cristian'*/
        Cuenta cuenta = new Cuenta("Cristian", new BigDecimal("1000.12345"));
//        cuenta.setPersona("Cristian");
        String esperado = "Cristian";
        String real = cuenta.getPersona();
        assertNotNull(real);
        assertEquals(esperado, real);
        assertTrue(real.equals("Cristian"));
    }

    @Test
    void test_SaldoCuenta(){     /*Verifica que el valor del atributo 'persona' sea igual a 'Cristian'*/
        Cuenta cuenta = new Cuenta("Cristian", new BigDecimal("1000.12345"));
        assertNotNull(cuenta.getSaldo());   /*Verifica que el atributo 'saldo' no sea 'null'*/
        assertEquals(1000.12345, cuenta.getSaldo().doubleValue());  /*Verifica que el valor del atributo 'saldo' sea igual a '1000.12345'*/
        assertFalse(cuenta.getSaldo().compareTo(BigDecimal.ZERO) < 0);  /*Verifica que el valor del atributo 'saldo' no sea menor a '0'*/
        assertTrue(cuenta.getSaldo().compareTo(BigDecimal.ZERO) > 0);   /*Verifica que el valor del atributo 'saldo' sea mayor a '0'*/
    }

    @Test
    void test_ReferenciaCuenta() {
        Cuenta cuenta = new Cuenta("John Doe", new BigDecimal("8900.9997"));
        Cuenta cuenta_2 = new Cuenta("John Doe", new BigDecimal("8900.9997"));

//        assertNotEquals(cuenta2, cuenta);     /*Compara por INSTANCIA*/
        assertEquals(cuenta_2, cuenta);         /*Compara por VALOR*/
    }

    @Test
    void test_DebitoCuenta() {   /*Verifica que se pueda realizar el método 'debito'*/
        Cuenta cuenta = new Cuenta("Cristian", new BigDecimal("1000.12345"));
        cuenta.debito(new BigDecimal(100)); /*Se debitan '100' del valor del atributo 'saldo'*/
        assertNotNull(cuenta.getSaldo());   /*Verifica que el atributo 'saldo' no sea 'null'*/
        assertEquals(900, cuenta.getSaldo().intValue());    /*Verifica que sea haya 'debitado' correctamente solo incluyendo el valor entero*/
        /*cuenta.getSaldo().intValue()) --> devuelve la parte entera del número*/
        assertEquals("900.12345", cuenta.getSaldo().toPlainString());   /*Verifica que sea haya 'debitado' correctamente incluyendo decimales*/
    }

    @Test
    void test_CreditoCuenta() {   /*Verifica que se pueda realizar el método 'credito'*/
        Cuenta cuenta = new Cuenta("Cristian", new BigDecimal("1000.12345"));
        cuenta.credito(new BigDecimal(100)); /*Se acreditan '100' al valor del atributo 'saldo'*/
        assertNotNull(cuenta.getSaldo());   /*Verifica que el atributo 'saldo' no sea 'null'*/
        assertEquals(1100, cuenta.getSaldo().intValue());    /*Verifica que sea haya 'acreditado' correctamente solo incluyendo el valor entero*/
        /*cuenta.getSaldo().intValue()) --> devuelve la parte entera del número*/
        assertEquals("1100.12345", cuenta.getSaldo().toPlainString());   /*Verifica que sea haya 'acreditado' correctamente incluyendo decimales*/
    }

    @Test
    void test_DineroInsuficienteExceptionCuenta() {  /*Verifica como se maneja el error en caso de que haya 'saldo' insuficiente*/
        Cuenta cuenta = new Cuenta("Cristian", new BigDecimal("1000.12345"));
        Exception exception = assertThrows(DineroInsuficiente_Exception.class, () -> cuenta.debito(new BigDecimal(1500)));
        String mensajeActual = exception.getMessage();
        String mensajeEsperado = "Dinero Insuficiente";
        assertEquals(mensajeEsperado, mensajeActual);
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

    @Test
    void test_RelacionBancoCuentas() {  /*Verifica las siguientes relaciones*/
        Cuenta cuenta_1 = new Cuenta("Jhon Doe", new BigDecimal("2500"));
        Cuenta cuenta_2 = new Cuenta("Cristian", new BigDecimal("1500.8989"));
        Banco banco = new Banco();
        banco.addCuenta(cuenta_1);
        banco.addCuenta(cuenta_2);

        banco.setNombre("Banco del Estado");
        banco.transferir(cuenta_2, cuenta_1, new BigDecimal(500));
        assertEquals("1000.8989", cuenta_2.getSaldo().toPlainString());
        assertEquals("3000", cuenta_1.getSaldo().toPlainString());

        assertEquals(2, banco.getCuentas().size()); /*Banco → Muchas → Cuentas*/
        assertEquals("Banco del Estado", cuenta_1.getBanco().getNombre());  /*Cuenta_1 → Solo un → Banco*/
        assertEquals("Cristian", banco.getCuentas() /*Cuenta → Solo un → Banco*/
                                                .stream()   /*Convertir 'List' en un tipo 'Stream'*/
                                                .filter(cuenta -> cuenta.getPersona().equals("Cristian"))   /*Filtrar la cuentas*/
                                                .findFirst()    /*Encontrar la primera 'cuenta' del 'Stream'*/
                                                .get().getPersona());   /*Obtener el valor del atributo 'persona' de la 'cuenta'*/
        assertTrue(banco.getCuentas().stream()
                .anyMatch(cuenta -> cuenta.getPersona().equals("Jhon Doe")));
    }
}