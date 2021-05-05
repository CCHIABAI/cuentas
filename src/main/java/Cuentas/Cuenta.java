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

/**
 * Programación Basica 2 - Comision 2900
 *
 * @author Claudio J. CHIABAI <cchiabai@alumno.unlam.edu.ar>
 */
public abstract class Cuenta
{

    private Double saldo;

    // CONSTRUCTORES ================================
    public Cuenta()
    {
        setSaldo(0.0);
    }

    public Cuenta(Double saldo)
    {
        setSaldo(saldo);
    }

    // PROPIEDADES ===================================
    public Double getSaldo()
    {
        return saldo;
    }

    protected void setSaldo(Double saldo)
    {
        this.saldo = saldo;
    }

    // METODOS =====================================
    public Boolean extraer(Double monto)
    {
        if (monto <= saldo)
        {
            saldo -= monto;
            return true;
        }
        else
        {
            return false;
        }
    }

    public void depositar(Double monto)
    {
        saldo += monto;
    }

}
