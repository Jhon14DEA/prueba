
//MODIFICADORES DE ACCESO

/**
 * El modificador de acceso PUBLIC se puede usar en cualquier otra clase siempre i cuando sea
 *  importadoa la clase con su paquete o sino solo se podra usar en clases que pertenescan al mismo 
 * paquete,  a diferencia del PRIVATE solo  puede ser usado en 
 * la misma clase y en ninguna otra clase mas asi se importe no se puede usar
 */

//ENCAPSULAMIENDO  Y METODOS ACCESORES

/**
 * El encapsulamiendo se encargada de ocultar tanto nuestros atributos o metodoos 
 * para que solamente puedan ser accedidos desde la misma clase y no puedan ser modificados 
 * desde otras clases a su antojo 
 * 
 */

//METODO ACCESORES 

/**
 * GETTERS Y SETTERS
 * Metodos setters:  Establacemos el valor al atributo
 * Metodo getters: Mostramos el valor del atributo tomado en el set
 * 
 */
package ATS67paK01_ModAcso_ENCAPSULAMIENTO;

/**
 *
 * @author ASUS
 */
public class Clas1 {
   
   
    /*Atributos para demostracion de modificadores de acceso
    private int atributo1;
    public  int atributo1;
    */
    
    //Codificacion para encapsulamiento 
    private int edad;
    private String nombre;
    
    
    public void setEdad(int edad){
    this.edad = edad;
    }
    
    public int getEdad(){
    return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
    

