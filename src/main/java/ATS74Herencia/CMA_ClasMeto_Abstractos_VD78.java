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
public class CMA_ClasMeto_Abstractos_VD78 {

    public static void main(String[] args) {

        /**
         * CMA_SerVivo servivo = new  CMA_SerVivo() 
         * 
         * la clases ser vivo al ser un metodo abstracto no puede ser instanceado por eso se 
         * usa la clase animal 
           */ 
        CMA_Planta  planta = new CMA_Planta();
        
        planta.alimentarse();
        CMA_AnimalCarnivoro animalCarnivoro =  new  CMA_AnimalCarnivoro();
        animalCarnivoro.alimentarse();
        
        
           
        
    }
    
    
    
}
