/*
 * Copyright (C) 2021 Claudio J. CHIABAI <cchiabai@alumno.unlam.edu.ar>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package Cuentas;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Claudio J. CHIABAI <cchiabai@alumno.unlam.edu.ar>
 */
public class CuentaTest
{
    
    public CuentaTest()
    {
    }
    
    /**
     * Test of extraer method, of class Cuenta.
     */

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


}
