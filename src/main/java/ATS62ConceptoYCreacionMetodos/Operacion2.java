/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ATS62ConceptoYCreacionMetodos;

import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class Operacion2 {
    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


    
    int numero1 ;
    int numero2 ;
    int suma;
    int resta;
    int multipliacion;
    int division;
    
    public void pedirDatos(){
    numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
    numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
    }
    
    public void sumar(int n1, int n2){
    suma = n1 + n2;
    }
    
    public  void restar (int numero1, int numero2){
    resta = numero1 - numero2;
    }
    
    public void multiplicar (int numero1, int numero2){
    multipliacion = numero1*numero2;
    }
    
    public  void division (int numero1, int numero2){
    division = numero1/numero2;
    }
    
    public void mostrarResultados(){
        System.out.println("la suma es "+suma);
        System.out.println("la resta es "+resta);
        System.out.println("la multipliacion es "+multipliacion);
        System.out.println("la division es "+division);
    }
}


    

