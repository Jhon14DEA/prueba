/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ATS83_Excepciones;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


/**
 *
 * @author ASUS
 */
public class VID83_TiposDeExcepciones {
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        //Exepciones Verificadas (IOExepcion)
        //lectura d e  un archivo de texto.
        /**
         * si yo le borro la carpeta texto me va a dar un error por lo tanto no es tanto la culpa del 
         * programador
          * 
         */
         BufferedReader bf = new BufferedReader(new FileReader("C:\\Objetivos\\texto.txt"));
         String linea;
         
         while ((linea = bf.readLine()) != null) {
             System.out.println(linea);
        }
         
         /**
          * Excepciones NO Verificadas (RunTimeExcepcion)
          * Divisionentre cero
          */
         
        int n1 = 5;
        int n2 = 0;
        int resultado;
         
         resultado = n1 / n2;
         
         System.out.println(resultado);
       
    }
}
