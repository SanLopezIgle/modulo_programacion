/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin16;

/**
 *
 * @author Sandra
 */
public class Boletin16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona persona1 = new Persona("Sandra", "Lopez", "23664564S");
        Conta conta1 = new Conta(persona1, 123456789);
        conta1.ingresar(300);
        System.out.println(conta1.getSaldo());
        conta1.retirar(50);
        System.out.println(conta1.getSaldo());
        
        CuentaAhorro conta2 = new CuentaAhorro(3f,200,persona1, conta1.getNumeroConta());
        conta2.ingresar(300);
        conta2.retirar(100);
        conta2.actualizarSaldo();
        System.out.println(conta2.toString());
    }
    
}
