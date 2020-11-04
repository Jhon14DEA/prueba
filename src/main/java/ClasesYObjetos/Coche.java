/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesYObjetos;

/**
 *
 * @author ASUS
 */
public class Coche {
    String color;
    String marca;
    int km;
    //metodo
    public static void main(String[] args) {
        //vamos a crear objetos de la clase coche 
        Coche coche1 = new Coche();
        
        coche1.color = "Blanco";
        coche1.marca = "Audi";
        coche1.km = 0;
        
        System.out.println("Color del coche 1: "+coche1.color);
        System.out.println("Marca del coche 1: "+coche1.marca);
        System.out.println("Kilomatraje del coche 1: "+coche1.km +"\n");
        
        Coche coche2 = new Coche();
        
        coche2.color = "Rojo";
        coche2.marca = "Ferrari";
        coche2.km = 100;
        
        System.out.println("Color del coche 2: "+coche2.color);
        System.out.println("Marca del coche 2: "+coche2.marca);
        System.out.println("Kilomatraje del coche 2: "+coche2.km);
        
                
    }
    
}
