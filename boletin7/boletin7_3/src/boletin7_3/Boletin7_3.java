/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin7_3;

import javax.swing.JOptionPane;

public class Boletin7_3 {

    
    public static void main(String[] args) {
         
        int numero = Integer.parseInt(JOptionPane.showInputDialog("num: "));
        
        if(numero>0) System.out.println("+");
        else if (numero<0) System.out.println("-");
        else System.out.println("0");
    }
    
}
