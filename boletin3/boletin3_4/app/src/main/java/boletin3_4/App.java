/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package boletin3_4;

import java.util.Scanner;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        //System.out.println(new App().getGreeting());
        Scanner sc = new Scanner(System.in);
        System.out.print("Dame el total: ");
        int total = sc.nextInt();
        
        int billetes100, billetes20, billetes5, monedas;
        billetes100 = total/100;
        billetes20 = (total%100)/20;
        billetes5 = ((total%100)%20)/5;
        monedas = ((total%100)%20)%5;
        
        System.out.println("Billetes de 100: " +billetes100);
        System.out.println("Billetes de 20: " +billetes20);
        System.out.println("Billetes de 5: " +billetes5);
        System.out.println("Monedas de 1: " +monedas);
    }
}
