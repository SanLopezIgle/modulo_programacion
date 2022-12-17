/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sandra.paqueteA;

/**
 *
 * @author dam1
 */
public class Personal {
    
    private String telefono;
    private String correo;
    
    public Personal(){
    }
    
    public Personal(String telefono, String correo){
        this.telefono = telefono;
        this.correo = correo;
    }
    
    public String getTelefono(){
        return telefono;
    }
    
    public String getCorreo(){
        return correo;
    }
    
    public void setTelefono(String telefono){
        this.telefono = telefono;
    }
    
    public void setCorreo(String correo){
        this.correo = correo;
    }
    
    public String toString(){
        return "Telefono: " + telefono + "\nCorreo: " + correo; 
    }
}
