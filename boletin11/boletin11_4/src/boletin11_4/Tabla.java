/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin11_4;

import java.util.Scanner;


public class Tabla {
    
    public void multiplicacion(){
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Numero: ");
        int numero = sc.nextInt();
        while(numero != 0){
            System.out.println("La tabla del " + numero + " es:");
            for(int i=1;i<=10;i++){
                System.out.println(numero + "*" + i + "=" + numero*i);
            }
            System.out.print("Numero: ");
            numero = sc.nextInt();
        }
    }
        
}
