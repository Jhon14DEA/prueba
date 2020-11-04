/**
 * Construir un programa que dada  una serie de vehiculos carasterizados por su marca
 * modelo y precio, imprima  las propiedades del vehiculo mas barato. para ellos
 * de deberan leer por teclado las caracteriticas de cada vehiculo y crear una clase que represente
 * a cada uno de ellos.
 */
package ATS71EjerciciosV62_69;

/**
 *
 * @author ASUS
 */
public class E3_Vehiculo {

    private String marca;
    private String modelo;
    private float precio;

    //Metodo constructor 
    public E3_Vehiculo(String marca, String modelo, float precio) {

        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public float getPrecio() {
        return precio;
    }

    public String mostrarDatos() {

        return "Marca: " + marca + "\nModelo: " + modelo + "\n Precio: " + precio;
    }

   

}
