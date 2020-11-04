/**
 * E1: Construir un programa que calcule el area y el perimetro de un cuadrilatero
 * dada la longitud de sus dos lados. los valores de la longitud deeberan
 * introducirce por linea de ordenes. si es un cuadrado, solo se proporciona la longitud
 * de uno  de los lados del constructor
 */
package ATS71EjerciciosV62_69;

import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class E1_Cuadrilatero {

    //Atributos
    private float lado1;
    private float lado2;

    public E1_Cuadrilatero(float lado1, float lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public E1_Cuadrilatero(float lado1) {
        this.lado1 = this.lado2 = lado1;
    }


    public float getPerimetro() {
        float perimetro = 2 * (lado1 + lado2);
        return perimetro;
    }

    public float getArea() {
        float area = lado1 * lado2;
        return area;
    }
    
            

}
