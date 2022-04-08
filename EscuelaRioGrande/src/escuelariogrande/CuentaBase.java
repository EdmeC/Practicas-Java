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
public abstract class CuentaBase {
    public final int id; 
    public final String nombre; 
    public final String apellido; 
    public final String email; 
    
    CuentaBase (int id, String nombre, String apellido, String email){
        this.id = id; 
        this.nombre = nombre; 
        this.apellido = apellido;
        this.email = email;
    }
    
    abstract void imprimirPerfil(); 
    
    
}
