
package boletin14;

import com.sandra.partes.Cpu;
import com.sandra.partes.Monitor;
import com.sandra.partes.Teclado;

/**
 * Clase en la que tenemos definido un ordenador
 * @author Sandra López Iglesias
 * @version 1.0
 */
public class Ordenador {

    /**
     * monitor del ordenador
     */
    private Monitor mo;
    /**
     * teclado del ordenador
     */
    private Teclado te;
    /**
     * procesador del ordenador
     */
    private Cpu pro;
    /**
     * precio del ordenador
     */
    private float precio;


    /**
     * Constructor vacio
     */
    public Ordenador(){
    }

    /**
     * Constructor
     * @param mo: monitor
     * @param te: teclado
     * @param pro: cpu
     * @param precio
     */
    public Ordenador(Monitor mo, Teclado te, Cpu pro, float precio){
        this.mo = mo;
        this.te = te;
        this.pro = pro;
        this.precio = precio;
    }

    /**
     * Getter monitor
     * @return mo: monitor
     */
    
    public Monitor getMonitor(){
        return mo;
    }

    /**
     * Getter teclado
     * @return te: teclado
     */
    public Teclado getTeclado(){
        return te;
    }


    /**
     * Getter cpu
     * @return pro: cpu
     */
    public Cpu getCpu(){
        return pro;
    }

    /**
     * Getter precio
     * @return precio
     */
    
    public float getPrecio(){
        return precio;
    }

    /**
     * Setter monitor
     * @param mo: monitor
     */
    public void setMonitor(Monitor mo){
        this.mo = mo;
    }

    /**
     * Setter teclado
     * @param te: teclado
     */
    public void setTeclado(Teclado te){
        this.te = te;
    }

    /**
     * Setter cpu
     * @param pro: cpu
     */
    public void setCpu(Cpu pro){
        this.pro = pro;
    }

    /**
     * Setter precio
     * @param precio
     */
    public void setPrecio(float precio){
        this.precio = precio;
    }

    /**
     * Metodo toString()
     * @return String con todas las caracteristicas del ordenador
     */
    @Override
    public String toString() {
        return mo + "\n" + te + "\n"+ pro + "\nprecio: " + precio;
    }
    
    
}
