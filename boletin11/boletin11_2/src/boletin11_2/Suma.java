/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin11_2;

public class Suma {
    
    public void sumar() {
        int resultado = 0;
        for (int numero = 9; numero < 91; numero++) {
            resultado += numero++;
        }
        System.out.println("Suma: " + resultado);
    }

    public void multiplicar(){
        int resultado = 1;
        for (int numero = 9; numero < 91; numero++) {
            resultado *= numero++;
        }
        System.out.println("Producto: " + resultado);
    }
}
