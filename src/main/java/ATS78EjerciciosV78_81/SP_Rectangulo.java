/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ATS78EjerciciosV78_81;

/**
 *
 * @author ASUS
 */
public class SP_Rectangulo extends SP_Poligono{
    
    private double lado1;
    private double lado2;

    public SP_Rectangulo(double lado1, double lado2) {
        super(3);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }

    @Override
    public String toString() {
        return "SP_Rectangulo\n"+super.toString()  + "lado1=" + lado1 + ", lado2=" + lado2 + '}';
    }
    
    @Override
    public double area(){
    return lado1*lado2;
    }
    
    
    
    
}
