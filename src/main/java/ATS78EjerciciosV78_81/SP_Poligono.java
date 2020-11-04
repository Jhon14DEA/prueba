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
public  abstract class SP_Poligono {
    
    protected int numeroLados;

    public SP_Poligono(int numeroLados) {
        this.numeroLados = numeroLados;
    }

    public int getNumeroLados() {
        return numeroLados;
    }

    @Override
    public String toString() {
        return "SP_Poligono" + "\nNumero de Lados: " + numeroLados;
    }
    //declaramos  el metodo area como abstracto
    public abstract double area();
    
    
    
    
}
