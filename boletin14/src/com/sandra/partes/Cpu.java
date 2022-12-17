
package com.sandra.partes;

/**
 *
 * @author Sandra López Iglesias
 * @version 1.0
 */
public class Cpu {

    /**
     * velocidad a la que funciona el procesador
     */
    private int velocidad;

    /**
     * Constructor vacio
     */
    public Cpu(){
    }

    /**
     * Constructor.
     * @param velocidad
     */
    public Cpu(int velocidad){
        this.velocidad = velocidad;
    }

    /**
     * Getter velocidad
     * @return velocidad
     */
    public int getVelocidad(){
        return velocidad;
    }

    /**
     * Setter velocidad
     * @param velocidad
     */
    public void setVelocidad(int velocidad){
        this.velocidad = velocidad;
    }

    /**
     * Metodo toString()
     * @return String con la velocidad del procesador
     */
    @Override
    public String toString() {
        return "velocidad procesador: " + velocidad;
    }
    
    
}
