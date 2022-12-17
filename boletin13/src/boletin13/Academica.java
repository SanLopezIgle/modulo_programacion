/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin13;

import com.sandra.paqueteA.Personal;
import javax.swing.JOptionPane;

/**
 *
 * @author dam1
 */
public class Academica {
        
    private static int numReferencia;
    private String nombre;
    private float nota;
    private Personal alumno;
    
    public Academica(){
    }
    
    public Academica(int numReferencia, String nombre, float nota, Personal alumno){
        numReferencia++;
        this.nombre = nombre;
        this.nota = nota;
        this.alumno = alumno;
    }
    
    public float comprobarNota(float nota){
        while((nota < 1) || (nota > 10)){
            nota = Float.parseFloat(JOptionPane.showInputDialog("Error. Nota no válida."));
        }
        return nota;
    }
    
    public int getNumReferencia(){
        return numReferencia;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public float getNota(){
        return nota;
    }
    
    public Personal getAlumno(){
        return alumno;
    }

    public void setNumReferencia(int numReferencia){
        this.numReferencia = numReferencia;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setNota(float nota){
        this.nota = nota;
    }
    
    public void setAlumno(Personal alumno){
        this.alumno = alumno;
    }
    
    @Override
    public String toString(){
        return "Numero de referencia: " + numReferencia + "\nNombre: " + nombre + "\nNota: " + nota + "\nDatos alumno:\n" + alumno;
    }
}
