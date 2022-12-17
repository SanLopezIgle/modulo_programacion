/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletinextra2;

public class Conta {
    
    private String nombreCliente, numCuenta;
    private double tipoInteres, saldo;
    
    public Conta(){
        
    }
    
    public Conta(String nombreCliente, String numCuenta, double tipoInteres, double saldo){
        this.nombreCliente = nombreCliente;
        this.numCuenta = numCuenta;
        this.tipoInteres = tipoInteres;
        this.saldo = saldo;
    }
    
    public void ingreso(double cantidad){
        saldo = cantidad + saldo;
    }
    
    public void reintegro(double cantidad){
        saldo = saldo - Math.abs(cantidad);
    }
    
    public void transferencia(Conta cuentaDestino, double importe){
        this.reintegro(importe);
        cuentaDestino.ingreso(importe);
    }
    
    public void transferencia2(Conta cuentaOrigen, Conta cuentaDestino, double importe){
        cuentaOrigen.reintegro(importe);
        cuentaDestino.ingreso(importe);
    }
    
    public String getNombreCliente(){
        return nombreCliente;
    }
    
    public String getNumCuenta(){
        return numCuenta;
    }
    
    public double getTipoInteres(){
        return tipoInteres;
    }
    
    public double getSaldo(){
        return saldo;
    }
    
    public void setNombreCliente(String nombreCliente){
        this.nombreCliente = nombreCliente;
    }
    
    public void setNumCuenta(String numCuenta){
        this.numCuenta = numCuenta;
    }
    
    public void setTipoInteres(double tipoInteres){
        this.tipoInteres = tipoInteres;
    }
    
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    
    
}
