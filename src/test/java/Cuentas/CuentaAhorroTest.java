/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cuentas;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Claudio J. CHIABAI <cchiabai@alumno.unlam.edu.ar>
 */
public class CuentaAhorroTest
{
    
    public CuentaAhorroTest()
    {
    }

    /**
     * Test of extraer method, of class CuentaAhorro.
     */
    @Test
    public void testExtraer()
    {

        CuentaSueldo instance = new CuentaSueldo();
        Double result = instance.getSaldo();
        
        // Deposito inicial =========================
        instance.depositar(1000.0);
        
        // Sin comision ===========================
        assertTrue(instance.extraer(50.0));
        assertEquals(950.0, (double) instance.getSaldo());
        assertTrue(instance.extraer(50.0));
        assertEquals(900.0, (double) instance.getSaldo());
        assertTrue(instance.extraer(50.0));
        assertEquals(850.0, (double) instance.getSaldo());
        assertTrue(instance.extraer(50.0));
        assertEquals(800.0, (double) instance.getSaldo());

        assertTrue(instance.extraer(100.0)); // + 6 de comision = 106
        assertEquals(694.0, (double) instance.getSaldo());
        
        assertTrue(instance.extraer(50.0)); // + 6 de comision = 56
        assertEquals(638.0, (double) instance.getSaldo());
        
        // No deberia ser posible extrear todo el saldo por la comision
        assertFalse(instance.extraer(instance.getSaldo())); // Saldo restante + 6 de comision 
        
    }
    
}
