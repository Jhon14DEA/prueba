/**
 * Diseniar un programa para trbaja4rrgrgre4g343t456ttk con triangulos isosceles. para ellos defina
 * los atributos necesario p que se requieren. proporciones metodo de  consulta
 * , unmetodo constructr e implemente metodos para caclular el perimetro y el area de un triangulo 
 * ademas implemetar un metodo que a a partir de unarregglo de trianfulos devuelva el area 
 * del triangulo de mayor superficie
 */
package ATS71EjerciciosV62_69;

/**
 *
 * @author ASUS
 */
public class E5_Triangulo_Isosceles {    

    private double base;
    private double lado;
    
    public  E5_Triangulo_Isosceles (double base, double lado){
        this.base =  base;
        this.lado =  lado;
    }
    
    public double obtenerPerimetro(){
    double perimetro =  2*(lado) + base;
    return perimetro;
    }
    
    public double obtenerArea(){
     double area = (base*Math.sqrt(lado*lado - ((base*base)/4)))/2;
     return area;
    }
  /*  
    public String mostrarDatos(){
    
        return "\nBase: " + base + "\nLado: " + lado 
                + "\nPerimetro: "+ obtenerPerimetro()+ "\nArea" + obtenerArea();
    }
*/


}