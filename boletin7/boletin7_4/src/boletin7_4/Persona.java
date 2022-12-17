/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin7_4;

public class Persona {
    
    String nombre;
    float peso;
    
    Persona(){
    }
    
    Persona(String nombre, float peso){
        this.nombre = nombre;
        this.peso = peso;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public float getPeso(){
        return peso;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setPeso(float peso){
        this.peso = peso;
    }
    
}
