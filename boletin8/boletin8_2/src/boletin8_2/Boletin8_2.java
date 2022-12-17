/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin8_2;

import javax.swing.JOptionPane;

public class Boletin8_2 {
 
    public static void main(String[] args) {
        
        String op = JOptionPane.showInputDialog("Dame la opcion: ");
      
        Opciones obj = new Opciones();
        obj.verOpciones(op);
    }
    
}
