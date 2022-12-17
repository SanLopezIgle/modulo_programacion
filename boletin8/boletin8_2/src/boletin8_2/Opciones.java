/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin8_2;

import java.util.Scanner;

public class Opciones {
    
    private float superficie, base, altura;
    private static final float PI = (float) 3.14;
    
    Scanner sc = new Scanner(System.in);
    
    public void verOpciones(String opcion){
        switch(opcion){
            case "cuadrado":
                System.out.println("lado: ");
                float lado = sc.nextFloat();
                superficie = (float) Math.pow(lado,lado);
                System.out.println("La superficie es: " + superficie);
                break;
            case "circulo":
                System.out.println("radio: ");
                float radio = sc.nextFloat();
                superficie = 2*PI*radio;
                System.out.println("La superficie es: " + superficie);
                break;
            case "triangulo":
                System.out.println("base: ");
                float base = sc.nextFloat();
                System.out.println("altura: ");
                float altura = sc.nextFloat();
                superficie = (base*altura)/2;
                System.out.println("La superficie es: " + superficie);
                break;
            default:
                System.out.println("Opcion incorrecta");
                break;
        }
    }
    
    
    
}
