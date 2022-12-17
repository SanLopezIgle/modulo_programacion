/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin17;

import javax.swing.JOptionPane;

/**
 *
 * @author Sandra
 */
public class Boletin17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Evaluacion nota = new Evaluacion();
        
        float mediaTeoria = nota.calcularNotaTeoria();
        float mediaPractica = nota.calculaNotaPractica();
        float mediaBoletines = nota.calcularNotaBoletines();
        
        float notaFinal = mediaTeoria + mediaPractica + mediaBoletines;
        
        JOptionPane.showMessageDialog(null, "Nota primer examen teoria: " + nota.getNotaPT1() +
                                                        "Nota segundo examen teoria: " + nota.getNotaPT2() +
                                                        "Nota práctica: " + nota.getNotaPractica() +
                                                        "Nota boletines: " + nota.getNotaBoletines() +
                                                        "Nota final: " + notaFinal);
    }
    
}
