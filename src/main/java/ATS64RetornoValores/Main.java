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
public class Main {
    public static void main(String[] args) {
    int n1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
    int n2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro numero"));
    
    Operacion op = new Operacion();
  /*Metodo 1 para imprimir.
    int s = op.sumar(n1, n2);
    int r = op.restar(n1, n2);
    int m = op.multiplicar(n1, n2);
    int d = op.division(n1, n2);
    op.mostrarResultados(m, r, m, d);
    */
  
  // Metodo 2  para imprimir 
    System.out.println("La suma es: "+op.sumar(n1, n2));
        System.out.println("La resta es: "+op.restar(n1, n2));
        System.out.println("La multipliacion es "+op.multiplicar(n1, n2));
        System.out.println("La division es "+op.division(n1, n2));
    }
    
    
}
