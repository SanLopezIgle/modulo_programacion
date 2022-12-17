/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin6_1;


public class Boletin6_1 {

    public static void main(String[] args) {
        Coche coche1 = new Coche();
        
        coche1.setVelocidade(120);
        coche1.acelerar(20);
        System.out.println("Velocidade: " + coche1.getVelocidade());
        coche1.frenar(40);
        System.out.println("velocidade: " + coche1.getVelocidade());
    }
    
}
