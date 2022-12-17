/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin15;

/**
 *
 * @author dam1
 */
public class Pelicula extends Multimedia{
    
    private String actor;
    private String actriz;
    
    public Pelicula(){
        super();
    }   

    public Pelicula(String actor, String actriz) {
        this.actor = actor;
        this.actriz = actriz;
    }

    public Pelicula(String actor, String actriz, String titulo, String autor, String formato, float duracion) {
        super(titulo, autor, formato, duracion);
        this.actor = actor;
        this.actriz = actriz;
    }
    
    public String getActor(){
        return actor;
    }
    
    public String getActriz(){
        return actriz;
    }
    
    public void setActor(String actor){
        this.actor = actor;
    }
    
    public void setActriz(String actriz){
        this.actriz = actriz;
    }

    @Override
    public String toString() {
        return super.toString() + "Pelicula{" + "actor=" + actor + ", actriz=" + actriz + '}';
    }
    
    
}
