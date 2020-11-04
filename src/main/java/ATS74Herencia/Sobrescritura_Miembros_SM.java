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
public class Sobrescritura_Miembros_SM {
    
    public static void main(String[] args) {
        
        Persona_SM persona =  new Persona_SM();
        
        Perro_SM perro = new Perro_SM();
        
        Vaca_SM vaca = new Vaca_SM();
        
        persona.comer();
        //va a imprimir "estoy sendado y comiendo con cubiertos"el de @Override
        perro.comer();
        //va a imprimir "estoy comiendo croquetas"
        vaca.comer();
        //va a imprimir  hola estoy comiende  de la clase Animal_SMe
        
    }
}
