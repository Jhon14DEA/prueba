/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ATS74Herencia;

/**
 *
 * @author ASUS
 */
public class VID1Estudiante_H  extends VID2Persona_H{
    
    private  int codigoEstudiante;
    private float notaFinal;
    
    public VID1Estudiante_H(String nombre, String apellido,int edad, int codigoEstudiante,float notaFinal){
    
        super(nombre, apellido, edad);
        this.codigoEstudiante = codigoEstudiante;
        this.notaFinal = notaFinal; 
    }
    
    public void mostrarDatos(){
        System.out.println("Nombre"+ getNombre()+"\nApellido: "+getApellido()
                +"\nEdad: "+getEdad()+"\nCodigo del estudiante: "+ codigoEstudiante+"\nNota Final: "+ notaFinal );
    }
     
}
