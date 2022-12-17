/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sandra.partes;

/**
 *
 * @author Sandra López Iglesias
 * @version 1.0
 */
public class Monitor {

    /**
     * pulgadas que mide el monitor
     */
    private float pulgadas;

    /**
     * Constructor vacio
     */
    public Monitor(){
    }

    /**
     * Constructor.
     * @param pulgadas
     */
    public Monitor(float pulgadas){
        this.pulgadas = pulgadas;
    }

    /**
     * Getter pulsadas
     * @return pulgadas
     */
    public float getPulgadas(){
        return pulgadas;
    }

    /**
     * Setter pulgadas
     * @param pulgadas
     */
    public void setPulgadas(float pulgadas){
        this.pulgadas = pulgadas;
    }

    /**
     * Metodo toString()
     * @return String con las pulgadas del monitor
     */
    @Override
    public String toString() {
        return "pulgadas del monitor: " + pulgadas;
    }
    
    
}
