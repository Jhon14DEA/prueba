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
public class P_VehiculoDeportivo extends P_Vehiculo{
    
 
    private int cilindrada;

    public P_VehiculoDeportivo(int cilindrada, String matricula, String marca, String modelo) {
        super(matricula, marca, modelo);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }
    
    
    
    @Override
    public String mostrarDatos(){
    return "Marca "+marca+"\nModelo"+modelo+"\nMatricula"+matricula+"\nCilindrada"+cilindrada+"\n";
    }
}
