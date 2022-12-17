/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin16;

import javax.swing.JOptionPane;

/**
 *
 * @author Sandra
 */
public class Conta {
    
    private long numeroConta;
    private double saldo;
    private Persona cliente;
    
    public Conta(){
        
    }
    
    public Conta(Persona cliente, long numeroConta){
        this.cliente = cliente;
        this.numeroConta = numeroConta;
    }
    
    public long getNumeroConta(){
        return numeroConta;
    }
    
    public double getSaldo(){
        return saldo;
    }
        
    public Persona getCliente(){
        return cliente;
    }
    
    public void setNumeroConta(long numeroConta){
        this.numeroConta = numeroConta;
    }
    
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    
    public void setCliente(Persona cliente){
        this.cliente = cliente;
    }
    
    public void ingresar(double cantidad){
        cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingresar dinero: "));
        saldo += cantidad;
    }
    
    public void retirar(double cantidad){
        cantidad = Integer.parseInt(JOptionPane.showInputDialog("Retirar dinero: "));
        saldo -= cantidad;
    }

    @Override
    public String toString() {
        return "Conta{" + "numeroConta=" + numeroConta + ", saldo=" + saldo + ", cliente=" + cliente + '}';
    }

    
}
