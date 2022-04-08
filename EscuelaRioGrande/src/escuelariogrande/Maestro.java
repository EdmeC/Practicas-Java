/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escuelariogrande;

/**
 *
 * @author edme
 */
public class Maestro extends CuentaBase {
    
    Maestro (int id, String nombre, String apellido, String email){
        super(id, nombre, apellido, email); 
    }
    
    @Override 
    void imprimirPerfil(){
    System.out.println("Id:"+ this.id); 
    System.out.println("Nombre:"+this.nombre);
    System.out.println("Apellido:"+this.apellido);
    System.out.println("Email:"+this.email);
    }
    
    
    
}
