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
public class Rectangulo implements IFigura {
    
    //Atributos 
    private double base; 
    private double altura; 
    
    //Constructor 
    Rectangulo (double base, double altura){
        this.base = base; 
        this.altura = altura; 
        
    }
    
    @Override
    public void dibujar(){
        System.out.println("Impresion de Rectangulo");
    }
    
    @Override 
    public double calcularArea(){
        return this.base * this.altura; 
    }
    
    @Override 
    public void imprimirArea(){
        System.out.println ("El area del rectangulo es: " + this.calcularArea());
    }
}
