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
public class Tutor extends CuentaBase implements ICalificacion{
    
    private String alumno; 
    
    Tutor (int id, String nombre, String apellido, String email){
        super(id, nombre, apellido, email);
        this.alumno="Adrian Martinez"; 
    }
    
    @Override 
    void imprimirPerfil(){
    System.out.println("Id:"+ this.id); 
    System.out.println("Nombre:"+this.nombre);
    System.out.println("Apellido:"+this.apellido);
    System.out.println("Email:"+this.email);
    }
    
    @Override
    public void mostrarcalificacion(){
        System.out.println ("Alumno:" + this.alumno);
        System.out.println("Calificacion:"); 
    }
}
