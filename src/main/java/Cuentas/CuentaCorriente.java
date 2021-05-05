
package Cuentas;

/**
 * Programación Basica 2 - Comision 2900
 * @author Claudio J. CHIABAI <cchiabai@alumno.unlam.edu.ar>
 */
public class CuentaCorriente extends Cuentas.Cuenta
{
    private Double comisionPorcentaje = 5.0;
    private Double montoDescubierto = 150.0;

    // CONSTRUCTOR ===============================

    public CuentaCorriente()
    {
    }

    public CuentaCorriente(Double saldo)
    {
        super(saldo);
    }

    public CuentaCorriente(Double saldo, Double montoDescubierto)
    {
        super(saldo);
        setMontoDescubierto(montoDescubierto);
    }
    
    public CuentaCorriente(Double saldo, Double montoDescubierto, Double comision)
    {
        super(saldo);
        setMontoDescubierto(montoDescubierto);
        setComisionPorcentaje(comisionPorcentaje);        
    }
    
    // PROPIEDADES ===============================
    public Double getMontoDescubierto()
    {
        return montoDescubierto;
    }

    public void setMontoDescubierto(Double montoDescubierto)
    {
        this.montoDescubierto = Math.abs(montoDescubierto);
    }

    public Double getComisionPorcentaje()
    {
        return comisionPorcentaje;
    }

    public void setComisionPorcentaje(Double comisionPorcentaje)
    {
        this.comisionPorcentaje = comisionPorcentaje;
    }

    // Metodos =================================================
    @Override
    public Boolean extraer(Double monto)
    {
        // Calcular pocentaje comision
        Double comision = monto * getComisionPorcentaje() / 100;
        monto = monto + comision;
        System.out.println(monto + " // " + comision + " // " + (monto + comision) + " // " +  getSaldo() );

        if (monto <= (getSaldo() + getMontoDescubierto()) )
        {
            super.setSaldo( getSaldo() - monto );
            return true;
        }
        else
        {
            return false;
        }
    }
    

}
