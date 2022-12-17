/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin13;

import com.sandra.paqueteA.Personal;

/**
 *
 * @author dam1
 */
public class Aplicacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Personal sandraDatos = new Personal("657856453", "sandra@gmail.com");
        Academica sandra = new Academica(20, "Sandra", (float)4.5, sandraDatos);
        //persona1.comprobarNota(persona1.getNota());
        /*System.out.println("Numero de referencia: " + sandra.getNumReferencia() +
                "\nNombre: " + sandra.getNombre() + "\nNota: " + sandra.comprobarNota(sandra.getNota())
                + "\nTelefono: " + sandraDatos.getTelefono() + "\nCorreo: " + sandraDatos.getCorreo());
        
        
        System.out.println(sandra.getAlumno());*/
        
        System.out.println(sandra.toString());
    }
    
}
