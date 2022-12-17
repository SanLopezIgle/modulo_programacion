/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin2_5;

import java.util.Scanner;

public class Boletin2_5 {

    final static double CONV = 1852;
    public static void main(String[] args) {
    
        double millas, metros, conv;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame las millas: ");
        millas = sc.nextDouble();

        metros = millas * CONV;
        System.out.println(millas + " millas son " +metros + " metros");
                
        
    }
    
}
