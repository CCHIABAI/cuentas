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
public class CuentaCorrienteTest
{
    
    public CuentaCorrienteTest()
    {
    }

    /**
     * Test of getMontoDescubierto method, of class CuentaCorriente.
     */
    @Test
    public void testGetMontoDescubierto()
    {
        // Constructor defecto -------------------------
        CuentaCorriente instance = new CuentaCorriente();
        assertEquals(0.0, (double) instance.getMontoDescubierto(), 0.0);

        // Constructor defecto -------------------------
        instance = new CuentaCorriente(100.0);
        assertEquals(100.0, (double) instance.getMontoDescubierto(), 0.0);
    }


    /**
     * Test of extraer method, of class CuentaCorriente.
     */
    @Test
    public void testExtraer()
    {
        
        System.out.println("extraer");
        Double monto = null;
        CuentaCorriente instance = new CuentaCorriente();
       
        // Deposito inicial =========================
        instance.depositar(1000.0);
        
        // Sin comision ===========================
        assertTrue(instance.extraer(100.0)); // 100 + 5% = 105$
        assertEquals(895.0, (double) instance.getSaldo(), 0.0);
        
        assertTrue(instance.extraer(100.0)); // 100 + 5% = 105$
        assertEquals(790.0, (double) instance.getSaldo(), 0.0);
        
        // No deberia ser posible extrear todo el saldo por la comision
        assertFalse(instance.extraer(instance.getSaldo())); // Saldo restante + 5% de comision 
    }
    
}
