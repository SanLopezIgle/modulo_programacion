/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin7_4;

public class Boletin7_4 {

    public static void main(String[] args) {    
        
        Persona persona1 = new Persona("Sandra", 67.2f);
        Persona persona2 = new Persona("Kevin", 92.7f);
        
        if(persona1.getPeso() > persona2.getPeso())
            System.out.println("Nombre: " + persona1.getNombre() + "\nPeso: " + persona1.getPeso());
        else    
            System.out.println("Nombre: " + persona2.getNombre() + "\nPeso: " + persona2.getPeso());
        
        System.out.println("Diferencia: " + (persona1.getPeso() - persona2.getPeso()));
    }
    
}
