/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin5;

public class Consumo {
    
    private float km, litros, vMed, pGas;
    
    public Consumo(){
      
    }
    
    public Consumo(float km, float litros, float vMed, float pGas){
        this.km = km;
        this.litros = litros;
        this.vMed = vMed;
        this.pGas = pGas;
    }
    
    public float getTempo(){
        float tiempo = km/vMed;
        return tiempo;
    }
    
    public float consumoMedio(){
        float media = litros*100/km;
        return media;
    }
    
    public float consumoEuros(){
        float euros = pGas*100/km;
        return euros;
    }
    
    public float getKm(){
        return km;
    }
    
    public float getLitros(){
        return litros;
    }
    
    public float getVMed(){
        return vMed;
    }
    
    public float getPGas(){
        return pGas;
    }
    
    public void setKm(float km){
        this.km = km;
    }
    
    public void setLitros(float litros){
        this.litros = litros;
    }
    
    public void setVMed(float vMed){
        this.vMed = vMed;
    }
    
    public void setPGas(float pGas){
        this.pGas = pGas;
    }
}
