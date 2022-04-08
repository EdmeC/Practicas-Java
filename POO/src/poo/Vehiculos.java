/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

/**
 *
 * @author edme
 */
public class Vehiculos {
    private String tipoVehiculo; 
    private int noLlantas; 
    
    public void arrancar () {
    System.out.println("Estoy arrancando"); 
    
}
    private void encender () {
    System.out.println("Estoy encendiendo"); 
}
    public void setTipoVehiculo (String tipo){
        this.tipoVehiculo=tipo; 
    }
        
    public String getTipoVehiculo (){
        return this.tipoVehiculo; 
}
    
    public void setNoLlantas (int numero){
        this.noLlantas=numero; 
    
    }
    
    public int getNoLlantas (){
        return this.noLlantas; 
    }

}