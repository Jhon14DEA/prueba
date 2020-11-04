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
public class Persona_SM extends Animal_SM{
    
    @Override//Significa que estamos sobrescribiendo eel metodo comer porque 
    // el metodo comer tambien esta en la clase Sobrescritura_Miembros_SM y en la clase 
    //Persona tambien pero  para   indicarle a java se debe de poner el @Overrride para que entienda
    
     public void comer(){
         System.out.println("Estoy comiendo sentado y con cubiertos");
     }
}
