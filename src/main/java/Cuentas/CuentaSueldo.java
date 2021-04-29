/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cuentas;

/**
 *
 * @author Claudio J. CHIABAI <cchiabai@alumno.unlam.edu.ar>
 */
public class CuentaSueldo
{
    private Double saldo;

    public CuentaSueldo()
    {
        this.saldo = 0.0;
    }

    public void depositar(Double monto)
    {
        saldo += monto;
    }

    protected Boolean extraerEnDescubierto(Double monto, Double montoDescubierto)
    {
        if (monto <= (saldo + Math.abs(montoDescubierto)) )
        {
            saldo -= monto;
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public Boolean extraer(Double monto)
    {
        // Sin descubierto 
        return extraerEnDescubierto(monto, 0.0);    
    }

    public Double getSaldo()
    {
        return saldo;
    }

}
