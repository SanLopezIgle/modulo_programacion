/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin7_2;

import java.util.Scanner;

public class Boletin7_2 {

    public static void main(String[] args) {
        
       Scanner sc = new Scanner(System.in);
       System.out.println("Dame el primer numero: ");
       short i = sc.nextShort();
       System.out.println("Dame el segundo numero: ");
       short n = sc.nextShort();
       
       Ejercicio2 ejercicio = new Ejercicio2();
       ejercicio.metodo(i, n);
    }
    
}
