
package com.sandra.partes;

/**
 * @author Sandra López Iglesias
 * @version 1.0
 */
public class Teclado {

    /**
     * marca del teclado
     */
    private String marca;

    /**
     * Constructor vacio
     */
    public Teclado(){
    }

    /**
     * Constructor.
     * @param marca
     */
    public Teclado(String marca){
        this.marca = marca;
    }

    /**
     * Getter marca
     * @return marca
     */
    public String getMarca(){
        return marca;
    }

    /**
     * Setter marca
     * @param marca
     */
    public void setMarca(String marca){
        this.marca = marca;
    }

    /**
     * Metodo toString()
     * @return String con la marca del teclado
     */
    @Override
    public String toString() {
        return "Marca del teclado: " + marca;
    }
}
