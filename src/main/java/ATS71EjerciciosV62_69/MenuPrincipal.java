/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ATS71EjerciciosV62_69;

import java.util.Scanner;
import javax.swing.JOptionPane;


/**
 *
 * @author ASUS
 */
public class MenuPrincipal {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion;

        opcion = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));

        switch (opcion) {

            case 1 -> {
                E1_Cuadrilatero C01;// = new E1_Cuadrilatero();

                float lado1;
                float lado2;

                lado1 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese un lado"));
                lado2 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese otro lado lado"));

                if (lado1 == lado2) {
                    C01 = new E1_Cuadrilatero(lado1);
                    System.out.println("Estas dentro de las medidas de un cuadrado");
                } else {
                    C01  = new E1_Cuadrilatero(lado1, lado2);
                }
                System.out.println("El perimetro es "+C01.getPerimetro());
                System.out.println("El area es "+C01.getArea());
                
                break;
            }
            case 2 -> {
            
                
                break;
            }
            case 3 -> {
            
                String marca, modelo;
                float precio;
                int numeroVechiculos, indiceBarato;
                
                System.out.println("Digite la cantidad de vehiculos"); 
                numeroVechiculos =  entrada.nextInt();
                //Creamos los objetos para los coches
                E3_Vehiculo coche[] = new E3_Vehiculo[numeroVechiculos];
                
                for (int i = 0; i < coche.length ; i++) {
                    entrada.nextLine();
                    System.out.println("Digite las caracteristicas del coche "+i+1+ ": ");
                    /*
                     marca = JOptionPane.showInputDialog("Ingrese la marca");
                     modelo = JOptionPane.showInputDialog("Ingrese el modelo");
                     precio  = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el precio"));
                    */
                    System.out.println("Digite la maraca");
                    marca = entrada.nextLine();
                    System.out.println("Digite el modelo");
                    modelo = entrada.nextLine();
                    System.out.println("Digite el precio");
                    precio = entrada.nextFloat();
                     
                     coche[i]  = new E3_Vehiculo(marca, modelo, precio);
                }
                
                indiceBarato = indiceCocheVarato(coche);
                System.out.println("\nEl coche mas barato es: ");
                System.out.println(coche[indiceBarato].mostrarDatos());
                
               break;
            }
            
            case 5 -> {
            
                
                double base, lado;
                int nTriangulos; 
                System.out.println("Digite el numero de triangulos a trabajar");
                nTriangulos = entrada.nextInt();
                
                E5_Triangulo_Isosceles triangulos[] =  new E5_Triangulo_Isosceles[nTriangulos];
                for(int i = 0; i< triangulos.length; i++){                
                  //  System.out.println("Digite los datos para el triangulo "+ (i+1));
                    
                    System.out.print("Digite la base del triangulo");
                    base = entrada.nextDouble();
                    System.out.print("Digite el lado");
                    lado = entrada.nextDouble();
                    
                     triangulos[i] =  new  E5_Triangulo_Isosceles(base, lado);
                     
                     System.out.println("\nEl perimetro es: "+ triangulos[i].obtenerPerimetro());
                     System.out.println("\nEl area es: "+triangulos[i].obtenerArea());  
                    
                }
                
                System.out.println("\nEl area de la superficie mayor es: "+ mayorArea(triangulos));
            }
                
            }
        /*
                default -> { 

        }
*/
    }
    //Metodo para el caso 3
     public static int indiceCocheVarato(E3_Vehiculo coche[]) {
        float precio;
        int indice = 0;

        precio = coche[0].getPrecio();
        for (int i = 1; i < coche.length; i++) {
            if (coche[i].getPrecio() < precio) {
                precio = coche[i].getPrecio();
                indice = i;
            }
        }
        return indice;
    }
    //Metodo para  el caso 5 
     public static double mayorArea(E5_Triangulo_Isosceles triangulos[]){
     double area;
     
     area = triangulos[0].obtenerArea();
     
     for(int i = 1; i<triangulos.length; i++){
     
         if(triangulos[i].obtenerArea()>area){
         area = triangulos[i].obtenerArea();
         }
     }
     return area; 
     }

}
