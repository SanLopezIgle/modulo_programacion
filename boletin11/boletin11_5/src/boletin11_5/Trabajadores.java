/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin11_5;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Trabajadores {
    int trabajadores1000 = 0;
    int trabajadores1750 = 0;
    
    public void sueldo(){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Sueldo: ");
        float sueldo = sc.nextFloat();
        
        if(sueldo < 0){
            System.out.println("no valido, dame otro: ");
            sueldo = sc.nextFloat();
        }
        
        while(sueldo != 0){
            System.out.println("Sueldo: ");
            sueldo = sc.nextFloat();
            if(sueldo < 1000) trabajadores1000++;
            else if ((sueldo>=1000) && (sueldo<=1750)) trabajadores1750++;
        }
        System.out.println("Trabajadores que ganan menos de 1000 hay " + trabajadores1000 + " y trabajadores que ganan entre 1000 y 1750 hay " + trabajadores1750);
    }
    
}

//(t2/(t1+t2))*100

/*
do{
    s = Integer.parseInt();
    if(s<0) System.out.println("ERROR   ");
    else if(s<1750 && s>1000) cs++;
    else if (s <1000 && s>0) cm++; 
    c++;
    System.out.println8"Salario de 1750-1000" +cs+ "\nPorcentaje de salarios menos de 1000" + cm);
}
*/