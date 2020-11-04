/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ATS74Herencia;

/**
 *
 * @author ASUS
 */
public class P_Vehiculo {
    protected String matricula;
    protected String  marca;
    protected String modelo;
    
    public P_Vehiculo(String matricula, String marca, String  modelo){
    this.matricula = matricula;
    this.marca =  marca;
    this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public String mostrarDatos(){
    return "Marca "+marca+"\nModelo"+modelo+"\nMatricula"+matricula;
    
    }
        
}
