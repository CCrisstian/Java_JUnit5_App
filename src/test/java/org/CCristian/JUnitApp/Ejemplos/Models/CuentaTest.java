package org.CCristian.JUnitApp.Ejemplos.Models;

import org.junit.jupiter.api.Test;
import java.math.BigDecimal;
import static org.junit.jupiter.api.Assertions.*;

class CuentaTest {

    @Test
    void testNombreCuenta(){
        Cuenta cuenta = new Cuenta("Cristian", new BigDecimal("1000.12345"));
//        cuenta.setPersona("Cristian");
        String esperado = "Cristian";
        String real = cuenta.getPersona();
        assertEquals(esperado, real);
        assertTrue(real.equals("Cristian"));
    }

    @Test
    void testSaldoCuenta(){
        Cuenta cuenta = new Cuenta("Cristian", new BigDecimal("1000.12345"));
        assertEquals(1000.12345, cuenta.getSaldo().doubleValue());
        assertFalse(cuenta.getSaldo().compareTo(BigDecimal.ZERO) < 0);
        assertTrue(cuenta.getSaldo().compareTo(BigDecimal.ZERO) > 0);
    }

    @Test
    void testReferenciaCuenta() {
        Cuenta cuenta = new Cuenta("John Doe", new BigDecimal("8900.9997"));
        Cuenta cuenta2 = new Cuenta("John Doe", new BigDecimal("8900.9997"));

//        assertNotEquals(cuenta2, cuenta);
        assertEquals(cuenta2, cuenta);
    }
}