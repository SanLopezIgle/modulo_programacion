/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletinextra1_3;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class BoletinExtra1_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        System.out.print("a =  ");
        float a = sc.nextFloat();
        
        System.out.print("b = ");
        float b = sc.nextFloat();
        
        System.out.print("c = ");
        float c = sc.nextFloat();
        
        float aux = (float) Math.sqrt((Math.pow(b, 2))-(4*a*c));
        
        if(aux>=0){
            float x1 = (float) ((-b+aux)/(2*a));
            float x2 = (float) ((-b-aux)/(2*a));
            System.out.print("La primera solucion es: " +x1);
            System.out.print("\nLa segunda solucion es: " +x2);
        }
        else System.out.println("No tiene solucion.");
    }
    
}
