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
public class Alumno extends CuentaBase implements ICalificacion{
   public double calificacion; 
    
    Alumno (int id, String nombre, String apellido, String email){
        super (id,nombre,apellido,email);  
    }
    
    @Override 
    void imprimirPerfil(){
    System.out.println("Id:"+ this.id); 
    System.out.println("Nombre:"+this.nombre);
    System.out.println("Apellido:"+this.apellido);
    System.out.println("Email:"+this.email);
    }
    
    public void setguardarcalificacion (double calificacion){
        this.calificacion = calificacion; 
    }
    
    public double getguardarcalifiacion (){
        return this.calificacion; 
    }
    
    @Override
    public void mostrarcalificacion(){
        System.out.println ("La calificacion actual es:" + this.calificacion); 
    }
    
}