/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletinextra1;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class BoletinExtra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Dame la base imponible: ");
        float baseImponible = sc.nextFloat();
        
        System.out.print("\nDame el IVA que se debe aplicar: ");
        float iva = sc.nextFloat();
        
        float ivaPagar = (baseImponible*iva)/100;
        float total = baseImponible + ivaPagar;
        
        System.out.println("\nTotal: " +total);
    }
    
}
