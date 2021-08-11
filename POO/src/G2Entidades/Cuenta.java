/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package G2Entidades;

public class Cuenta {

private int numeroCuenta;
private long  Dni;
private double Saldo;

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getDni() {
        return Dni;
    }

    public void setDni(long Dni) {
        this.Dni = Dni;
    }

    public double getSaldo() {
        return Saldo;
    }

    public void setSaldo(double Saldo) {
        this.Saldo = Saldo;
    }

    public Cuenta(int numeroCuenta, long Dni, double Saldo) {
        this.numeroCuenta = numeroCuenta;
        this.Dni = Dni;
        this.Saldo = Saldo;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "numeroCuenta=" + numeroCuenta + ", Dni=" + Dni + ", Saldo=" + Saldo + '}';
    }

    
    
}
