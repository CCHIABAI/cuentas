
package Cuentas;

/**
 * Programación Basica 2 - Comision 2900
 * @author Claudio J. CHIABAI <cchiabai@alumno.unlam.edu.ar>
 */
public class CuentaAhorro extends Cuentas.Cuenta
{
    private Double comision = 6.0;
    private final Integer EXTRACCIONES_SIN_COMISION = 4;
    private Integer cantidadExtracciones = 0;
    
    public CuentaAhorro()
    {
    }
    
    public CuentaAhorro(Double saldo)
    {
        super(saldo);
    }
    
    public CuentaAhorro(Double saldo, Double comision)
    {
        super(saldo);
        setComision(comision);
    }

    
    // PROPIEDADES ==================================
    public Double getComision()
    {
        return comision;
    }

    public void setComision(Double comision)
    {
        this.comision = comision;
    }

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
