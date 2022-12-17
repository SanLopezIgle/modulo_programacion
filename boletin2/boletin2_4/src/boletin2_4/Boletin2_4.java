/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin2_4;

import java.util.Scanner;

public class Boletin2_4 {

    public static void main(String[] args) {

        float num1, num2;
        float suma, resta, producto, cociente;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Dame el primer numero: ");
        num1 = sc.nextFloat();
        System.out.print("Dame el segundo numero: ");
        num2 = sc.nextFloat();
        
        suma = num1 + num2;
        resta = num1 - num2;
        producto = num1 * num2;
        cociente = num1 / num2;
        
        System.out.println("suma: "+suma+"\nresta: "+resta+"\nproducto: "+producto+"\ncociente: "+cociente);
    
    }
    
}
