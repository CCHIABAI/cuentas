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
public class CuentaSueldoTest
{
    
    public CuentaSueldoTest()
    {
    }


    /**
     * Test of extraer method, of class CuentaSueldo.
     */
    @Test
    public void testExtraer()
    {
        CuentaSueldo instance = new CuentaSueldo();
        Double result = instance.getSaldo();
        
        // No se puede sacar si esta vacia.
        assertFalse(instance.extraer(100.0));
        instance.depositar(100.0);
        
        // 100 saldo > 50 - Posible de extraer
        assertTrue(instance.extraer(50.0));
        
        // 50 saldo < 100 - no posible de extraer
        assertFalse(instance.extraer(100.0));
        
    }

    /**
     * Test of getSaldo method, of class CuentaSueldo.
     */
    @Test
    public void testGetSaldo()
    {
        CuentaSueldo instance = new CuentaSueldo();
        Double result = instance.getSaldo();
        assertEquals( (double) 0.0, (double) result, 0.0);
        
        instance.depositar(100.0);
        assertEquals( (double)  100.0, (double) instance.getSaldo(), 0.0);
        
        instance.extraer(10.0);
        assertEquals( (double)  90.0, (double) instance.getSaldo(), 0.0);      
    }


    /**
     * Test of extraerEnDescubierto method, of class CuentaSueldo.
     */
    @Test
    public void testExtraerEnDescubierto()
    {
        CuentaSueldo instance = new CuentaSueldo();
        
        // 100 saldo + 100 descubierto = 200 posible de extraer
        instance.depositar(100.0);
        assertTrue(instance.extraerEnDescubierto(200.0, 100.0)); 
        
        // 100 saldo + 50 descubierto = 150 posible de extraer
        instance.depositar(100.0);
        assertFalse(instance.extraerEnDescubierto(200.0, 50.0));              
        
    }
    
}
