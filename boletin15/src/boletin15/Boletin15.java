/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin15;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author dam1
 */
public class Boletin15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pelicula obj1 = new Pelicula( "ddd", "ccc", "aaa", "bbb", "ccc", 1);
        Disco obj2 = new Disco("xxx", "aaa", "bbb", "ccc", 1);
        
        System.out.println(obj1.toString());
        System.out.println(obj2.toString());                                                                                                                                                                                                            
        
        Pelicula peli = new Pelicula();
        peli.setActor(pedirDatos("Autor: "));
        peli.setActriz(pedirDatos("Actriz: "));
        peli.setAutor(pedirDatos("Autor: "));
        peli.setTitulo(pedirDatos("Titulo: "));
        peli.setFormato(pedirDatos("Formato: "));
        peli.setDuracion(Integer.parseInt(pedirDatos("Duracion: ")));
    }
    
    public static String pedirDatos(String mensaje){
        return JOptionPane.showInputDialog(mensaje);
    }
    
}
