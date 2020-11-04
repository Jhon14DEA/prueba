/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ATS65MetodoConstructor;

/**
 *
 * @author ASUS
 */
public class Persona {
     //Atributos
    String  nombre;
    int edad;
    
    //Metodos
    
    //Metodo constructor
    
    //FORMA 1
    public Persona (String _nombre, int _edad){
    nombre = _nombre;
    edad= _edad; 
    }
    /*FORMA 2
    public Persona (String nombre, int edad){
    this.nombre = nombre;
    this.edad = edad;
    } */
    
    public void mostrarDatos(){
        System.out.println("El nombre es "+nombre);
        System.out.println("la edad es "+edad);
    }
}
