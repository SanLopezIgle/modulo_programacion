
package boletin14;

import com.sandra.partes.Cpu;
import com.sandra.partes.Monitor;
import com.sandra.partes.Teclado;

/**
 * @author Sandra López Iglesias
 * @version 1.0
 */
public class Boletin14 {

    /**
     * Clase que me dice las caracteristicas de un ordenador
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Monitor monitor = new Monitor((float) 5.6);
        Teclado teclado = new Teclado("marca");
        Cpu procesador = new Cpu(45);
        Ordenador ordenador = new Ordenador(monitor,teclado,procesador,(float)456.7);
        
        System.out.println(ordenador.toString());
        System.out.println("precio: " + ordenador.getPrecio());
        System.out.println(ordenador.getTeclado().getMarca());
        System.out.println(ordenador.getCpu().getVelocidad());
        
        
        /*
        Ordenador ordenador1 = new Ordenador(new Monitor(23f), new Teclado("marca2"), new Cpu(23), 34.5f);
        System.out.println(ordenador1.toString());
        */
    }
    
}
