/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package boletin3_5;

import java.util.Scanner;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        //System.out.println(new App().getGreeting());
        int nventas, nkm, ndias;
        float fijo;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Dame el numero de ventas: ");
        nventas = sc.nextInt();
        
        System.out.print("Dame el numero de km: ");
        nkm = sc.nextInt();
        
        System.out.print("Dame el numero de dias: ");
        ndias = sc.nextInt();
        
        System.out.print("Dame el sueldo fijo: ");
        fijo = sc.nextInt();
        
        float bruto, comision, quilometraje, dietas;
        comision = nventas*0.05f;
        quilometraje = nkm*2;
        dietas = ndias*30;
        bruto = fijo + comision + quilometraje + dietas;
        
        float irpf, retencion, liquido;
        
        irpf = bruto*0.18f;
        retencion = 36;
        
        liquido = bruto - (irpf + retencion);
        
        System.out.println("Sueldo bruto: " +bruto);
        System.out.println("Sueldo liquido: " +liquido);
    }
}
