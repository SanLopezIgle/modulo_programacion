/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin16;

/**
 *
 * @author Sandra
 */
public class Persona {
    
    private String nombre;
    private String apellidos;
    private String NIF;
    
    public Persona(){
        
    }
    
    public Persona(String nombre, String apellidos, String NIF){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.NIF = NIF;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public String getApellidos(){
        return apellidos;
    }
    
    public String getNIF(){
        return NIF;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setApellidos(String apellidos){
        this.apellidos = apellidos;
    }
    
    public void setNIF(String NIF){
        this.NIF = NIF;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", NIF=" + NIF + '}';
    }
    
}
