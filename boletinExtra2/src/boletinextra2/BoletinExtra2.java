/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletinextra2;

public class BoletinExtra2 {

    public static void main(String[] args) {
        Conta cuenta1 = new Conta("AAA", "2A", 345, 234);
        Conta cuenta2 = new Conta("BBB", "2B", 245, 345);
        
        System.out.println("Saldo cuenta1: " + cuenta1.getSaldo());
        System.out.println("Saldo cuenta2: " + cuenta2.getSaldo());
        
        cuenta1.transferencia(cuenta2, 30);
        
        System.out.println("\nSaldo cuenta1: " + cuenta1.getSaldo());
        System.out.println("Saldo cuenta2: " + cuenta2.getSaldo());
        
        cuenta1.transferencia2(cuenta2, cuenta1, 30);
        
        System.out.println("\nSaldo cuenta1: " + cuenta1.getSaldo());
        System.out.println("Saldo cuenta2: " + cuenta2.getSaldo());
    }
    
}
