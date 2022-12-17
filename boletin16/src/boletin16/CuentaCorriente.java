/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin16;

/**
 *
 * @author Sandra
 */
public class CuentaCorriente extends Conta {
    
    final static double INTERES = 1.5;
    
    public CuentaCorriente(){
        
    }
    
    public CuentaCorriente(Persona cliente, long numeroConta){
        super(cliente, numeroConta);
    }
    
    public void actualizarSaldo(){
        super.setSaldo(super.getSaldo() + (super.getSaldo() * (INTERES/100)));
    }

    @Override
    public String toString() {
        return super.toString() + " Intereses Cuenta Corriente{" + INTERES + '%';
    }
    
    
}
