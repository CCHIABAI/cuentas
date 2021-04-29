/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Cuentas;

/**
 * Programación Basica 2 - Comision 2900
 * @author Claudio J. CHIABAI <cchiabai@alumno.unlam.edu.ar>
 */
public class CuentaAhorro extends Cuentas.CuentaSueldo
{
    private final Double COMISION = 6.0;
    private final Integer EXTRACCIONES_SIN_COMISION = 4;
    private Integer cantidadExtracciones = 0;
    

    @Override
    public Boolean extraer(Double monto)
    {        
        // Sumarle COMISION al monto a extraer
        if (cantidadExtracciones < EXTRACCIONES_SIN_COMISION ) 
            cantidadExtracciones++;
        else
            monto += 6;            
        
        return super.extraer(monto); 
    }
    
}
