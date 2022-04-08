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
public class Test {
    public static void main (String[]args){
        Rectangulo rectangulo = new Rectangulo (10.3, 20.0); 
        rectangulo.imprimirArea();
        
        Circulo circulo = new Circulo (9.5); 
        circulo.imprimirArea();
    }
}
