/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin7_5;

public class Ejercicio5 {
    
    public void verMayor(int num1, int num2, int num3){
        
        if((num1>num2) && (num1>num3)) System.out.println("El mayor es el primero: " +num1);
        else if ((num2>num1) && (num2>num3)) System.out.println("El mayor es el segundo: " +num2);
        else System.out.println("El mayor es el tercero: " +num3);
    }
}
