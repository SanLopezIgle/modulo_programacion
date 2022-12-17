/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletinextra1_2;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class BoletinExtra1_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Dame a: ");
        float a = sc.nextFloat();
        
        System.out.print("Dame b: ");
        float b = sc.nextFloat();
        
        System.out.print("Dame c: ");
        float c = sc.nextFloat();
        
        System.out.print("Dame x: ");
        float x = sc.nextFloat();
        
        float y = (float) ((a*Math.pow(x, 2)) + (b*x) + c);
        System.out.println("Y = " +y);
    }
    
}
