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
public class Test{
    
public static void main(String[] args) {
    Maestro maestro = new Maestro (146,"Juan", "Gonzalez", "juanglz.rio@gmail.com");
    maestro.imprimirPerfil();
   
    Alumno alumno = new Alumno (256,"Adrian","Martinez","adrianmtz@gmail.com");
    alumno.imprimirPerfil();
    alumno.setguardarcalificacion(7.6);
    alumno.mostrarcalificacion(); 
    
    Tutor tutor = new Tutor (356,"Michelle","Flores","michelleflor@gmail.com");
    tutor.imprimirPerfil();
    tutor.mostrarcalificacion();
    System.out.println(alumno.getguardarcalifiacion());
    
    
}


}
