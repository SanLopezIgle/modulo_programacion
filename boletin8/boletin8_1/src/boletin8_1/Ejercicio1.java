/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin8_1;

public class Ejercicio1 {
   
    
    public void verVentas(int ventas){
        if(ventas <= 100) System.out.println("Bajo");
        else if ((ventas>100) && (ventas<= 500)) System.out.println("Bajo");
        else if ((ventas>500) && (ventas<=1000)) System.out.println("Medio");
        else if (ventas>1000) System.out.println("Primera necesidad");
    }
    
    
}
