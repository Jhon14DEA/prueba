/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ATS67paK01_ModAcso_ENCAPSULAMIENTO;

/**
 *
 * @author ASUS
 */
public class Clas2 {
    
    public static void main(String[] args) {
        /*Atributos para demostracion de modificadores de acceso
        Clas1 objeto1 = new Clas1();
        
        objeto1.atributo1 = 15;
        */
        
        Clas1 objeto1 = new Clas1();
        
        objeto1.setEdad(10);
        System.out.println("la edad es :"+objeto1.getEdad()); 
        
        objeto1.setNombre("John");
        System.out.println("El nombre es: "+objeto1.getNombre()); 
  }
    
}
