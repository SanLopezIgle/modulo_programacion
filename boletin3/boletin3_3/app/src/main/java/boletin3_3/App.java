/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package boletin3_3;

import java.util.Scanner;

public class App {
    /*public String getGreeting() {
        return "Hello World!";
    }*/

    public static void main(String[] args) {
        //System.out.println(new App().getGreeting());
        
        int cont = 0;
       
       
        Scanner sc = new Scanner(System.in);
        System.out.println("Billetes de 100: ");
        int billetes100 = sc.nextInt();
        cont = billetes100*100;
        
        System.out.println("Billetes de 20: ");
        int billetes20 = sc.nextInt();
        cont += (billetes20*20);
        
        System.out.println("Billetes de 5: ");
        int billetes5 = sc.nextInt();
        cont += billetes5*5;
        
        System.out.println("Monedas de 1: ");
        int monedas1 = sc.nextInt();
        cont += monedas1;
        

        System.out.print("La cantidad total es: "+cont);
    }
}
