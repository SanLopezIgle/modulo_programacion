/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin7_5;

import javax.swing.JOptionPane;

public class Boletin7_5 {

    public static void main(String[] args) {
        
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("num1: "));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("num2: "));
        int num3 = Integer.parseInt(JOptionPane.showInputDialog("num3: "));
        
        Ejercicio5 ej = new Ejercicio5();
        ej.verMayor(num1, num2,num3);
        
    }
    
}
