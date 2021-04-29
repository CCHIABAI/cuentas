/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cuentas;

/**
 * Programación Basica 2 - Comision ####
 *
 * @author Claudio J. CHIABAI <cchiabai@alumno.unlam.edu.ar>
 */
public class CuentaCorriente extends CuentaSueldo
{

    private final Double COMISION_PORCENTAJE = 5.0;
    private Double montoDescubierto = 0.0;

    public CuentaCorriente()
    {
    }

    public CuentaCorriente(Double montoDescubierto)
    {
        setMontoDescubierto(montoDescubierto);
    }

    // Propiedades =====================================
    public Double getMontoDescubierto()
    {
        return montoDescubierto;
    }

    public void setMontoDescubierto(Double montoDescubierto)
    {
        this.montoDescubierto = montoDescubierto;
    }

    // Metodos =================================================
    @Override
    public Boolean extraer(Double monto)
    {
        // Calcular pocentaje comision
        Double comision = monto * COMISION_PORCENTAJE / 100;
        
        return super.extraerEnDescubierto(monto + comision, getMontoDescubierto());
    }

}
