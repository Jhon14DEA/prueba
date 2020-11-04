/**
 * DEBER PARA LA CASA
 * 
 * ejercicio 10: Crear un programa para simular un equipo de futbol(futbolista, entrenador y  doctor)
 * para lo cual tendremos lo siguiente:
 *-una super clase persona que tendra los siguientes datos:  nombre, apellido y edad
 * -la sub clases futbolista tendra los   siquientes datos: dorsal y posicion 
 * -la sub clases entrenado  tendra de dato la estrategia que utiliza
 * -La sub clase  doctor tendrala titulacion  y los años de experiencia
 * 
 * Hacer un menu donde se tenga las siguientes opciones: viaje de equipo, entrenamiento, partido de futbol, planificar entrenamiento 
 * entrevista, curar lesion.
 */
package ATS78EjerciciosV78_81;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class SP_VID_78_SofftwarePoligonos {
    
    static  ArrayList<SP_Poligono> poligono = new ArrayList<SP_Poligono>();
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
    
        //llenar un poligono 
        llenarPoligono();
        mostrarResultados();
    }
        public static void llenarPoligono(){
        
            int opcion;
            char respuesta;
            do {
                
                do {                    
                 System.out.println("\nDigite que poligono desea ");
                System.out.println("1. Triangulo\n 2.Rectangulo");
                System.out.println("Opcion: ");
                opcion = entrada.nextInt(); 
                } while (opcion<1 || opcion>2);
                
                switch (opcion){
                    case 1->{//llenar triangulo
                        
                        llenarTriangulo();
                        //mostrar los datos y el area de cada poligono

                        break;
                    }
                    case 2-> {//llenar rectangulo
                        
                        llenarRectangulo();
                        
                        break;
                    }
                }
                System.out.println("Desea introducir otro poligono (s/n): ");
                respuesta = entrada.next().charAt(0); 
                System.out.println("");
            } while (respuesta == 's'|| respuesta == 's');
        }
        
        public static void llenarTriangulo(){
            
            double l1, l2,l3;
            System.out.println("\nDigite el lado 1  uno del triangulo");
            l1 = entrada.nextDouble();
            System.out.println("Digite el lado 2  uno del triangulo");
            l2 = entrada.nextDouble();
            System.out.println("\nDigite el lado 3  uno del triangulo");
            l3 = entrada.nextDouble();
            
            SP_Triangulo triangulo = new SP_Triangulo(l1, l2, l3);
            
            //Guardamos un triangulo dentro de nuestro arreglo de poligonos
            poligono.add(triangulo);
            
        }
        
        public static void llenarRectangulo(){
            
            double l1, l2;
            System.out.println("\nDigite el lado 1  uno del rectangulo");
            l1 = entrada.nextDouble();
            System.out.println("Digite el lado 2  uno del rectangulo");
            l2 = entrada.nextDouble();
                        
            SP_Rectangulo rectangulo  = new SP_Rectangulo(l1, l2);
            
            //Guardamos un rectangulo dentro de nuestro arreglo de poligonos
            poligono.add(rectangulo);
            
        }
        
        public static void mostrarResultados(){
        
        for (SP_Poligono sP_Poligono : poligono) {
                System.out.println(sP_Poligono.toString());
                System.out.println("El area es: "+sP_Poligono.area());
            }
        }
        
    }

