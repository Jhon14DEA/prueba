/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ATS66SobrecargaDeMetodos;

/**
 *
 * @author ASUS
 */
public class Persona {
    
    ///Atributos
    String nombre;
    int edad;
    String dni;
    //Sobrecarga de constructores
    
    //Los metodos constructores se pueden sobrecargar siempre  y cuadno los 
    //parametros del metodo seandiferentes el nombre del metodo constructor 
    //es el mismo lo uno que deberia de cambiar por ley son los parametros

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Persona(String dni) {
        this.dni = dni;
    }
    
    //Sobrecarga de metodos
    
    public void correr(){
        System.out.println("Soy "+nombre+" tengo "+edad+" anios estoy corriendo una maraton");
        
    }
    public void correr(int km){
        System.out.println("Eh corrido "+km+" Kilometros");
    }
    
    
    
}
