/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin16;

/**
 *
 * @author Sandra
 */
public class CuentaAhorro extends Conta{
    
    private float interes;
    private double saldoMinimo;
    
    public CuentaAhorro(){
        
    }
    
    public CuentaAhorro(float interes, double saldoMinimo){
        this.interes = interes;
        this.saldoMinimo = saldoMinimo;
    }
     
    public CuentaAhorro(float interes, double saldoMinimo, Persona cliente, long numeroConta){
        super(cliente, numeroConta);
        this.interes = interes;
        this.saldoMinimo = saldoMinimo;
    }
    
    public float getInteres(){
        return interes;
    }
    
    public double getSaldoMinimo(){
        return saldoMinimo;
    }
    
    public void setInteres(float interes){
        this.interes = interes;
    }
    
    public void setSaldoMinimo(double saldoMinimo){
        this.saldoMinimo = saldoMinimo;
    }
    
    public void actualizarSaldo(){
        if(super.getSaldo() >= saldoMinimo){
            super.setSaldo(super.getSaldo() + (super.getSaldo() * (interes/100)));
        }
    }

    @Override
    public String toString() {
        return super.toString() + "CuentaAhorro{" + "interes=" + interes + ", saldoMinimo=" + saldoMinimo + '}';
    }
    
    
}
