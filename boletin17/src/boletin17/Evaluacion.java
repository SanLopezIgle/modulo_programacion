/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin17;

import javax.swing.JOptionPane;

/**
 *
 * @author Sandra
 */
public class Evaluacion {
    
    private float notaPT1;
    private float notaPT2;
    private float notaPractica;
    private float notaBoletines;
    
    public Evaluacion(){
        
    }
    
    public Evaluacion(float notaPT1, float notaPT2, float notaPractica, float notaBoletines){
        this.notaPT1 = notaPT1;
        this.notaPT2 = notaPT2;
        this.notaPractica = notaPractica;
        this.notaBoletines = notaBoletines;
    }
    
    public float getNotaPT1(){
        return notaPT1;
    }
    
    public float getNotaPT2(){
        return notaPT2;
    }
    
    public float getNotaPractica(){
        return notaPractica;
    }
    
    public float getNotaBoletines(){
        return notaBoletines;
    }
    
    public void setNotaPT1(float notaPT1){
        this.notaPT1 = notaPT1;
    }
    
    public void setNotaPT2(float notaPT2){
        this.notaPT2 = notaPT2;
    }
    
    public void setNotaPractica(float notaPractica){
        this.notaPractica = notaPractica;
    }
    
    public void setNotaBoletines(float notaBoletines){
        this.notaBoletines = notaBoletines;
    }
    
    public float validarNota(String mensaje){
        float nota;
        do{
            nota = Float.parseFloat(JOptionPane.showInputDialog(mensaje));
        } while (nota < 0 || nota > 10);
        return nota;
    }
    
    public static float pedirNumero(String mensaje){
        return Float.parseFloat(JOptionPane.showInputDialog(mensaje));
    }
    
    public float calcularNotaTeoria(){
        notaPT1 = validarNota("Nota PT1: ");
        notaPT2 = validarNota("Nota PT2: ");
        float media = (notaPT1 + notaPT2) / 2 * 0.40f;
        return media;
    }
    
    public float calculaNotaPractica(){
        notaPractica = validarNota("Nota prueba practica: ");
        float media = notaPractica * 0.40f;
        return media;
    }
    
    public float calcularNotaBoletines(){
        float totalBoletines = pedirNumero("Cantidad de boletines: ");
        float boletin = pedirNumero("Boletines hechos: ");
        
        if(((boletin/totalBoletines) * 100) > 90) notaBoletines = 2;
        else if ((((boletin / totalBoletines) * 100) >= 70) || (((boletin/totalBoletines) * 100) <= 90)) notaBoletines = 1;
        else notaBoletines = 0;
        return notaBoletines;
    }
}
