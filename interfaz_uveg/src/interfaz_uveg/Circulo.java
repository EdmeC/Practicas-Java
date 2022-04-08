/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz_uveg;

/**
 *
 * @author edme
 */
public class Circulo implements IFigura{
    private static final double PI = 3.1416; 
    private double radio; 
    
    Circulo(double radio){
        this.radio = radio; 
    }
    
    @Override 
    public void dibujar(){
    System.out.println("Impresion de circulo");        
    }
    
    @Override 
    public double calcularArea(){
        return PI * Math.pow(this.radio,2); 
    }
    
    @Override
    public void imprimirArea(){
        System.out.println("El area del circulo es:" + this.calcularArea());
    }

}
    
  
