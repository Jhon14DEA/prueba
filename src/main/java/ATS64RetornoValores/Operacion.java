/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ATS64RetornoValores;

import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class Operacion {
   
    
    
    public int sumar(int n1, int n2){
    int suma = n1 + n2;
    return  suma;
    }
    
    public  int restar (int numero1, int numero2){
    int resta = numero1 - numero2;
    return  resta;
    }
    
    public int multiplicar (int numero1, int numero2){
    int multipliacion = numero1*numero2;
    return multipliacion;
    }
    
    public int division (int numero1, int numero2){
    int division = numero1/numero2;
    return division;
    }
    /*Metodo 1  para imprimir
    public void mostrarResultados(int suma, int resta, int multipliacion, int division){
        System.out.println("la suma es "+suma);
        System.out.println("la resta es "+resta);
        System.out.println("la multipliacion es "+multipliacion);
        System.out.println("la division es "+division);
    }*/
    
}
