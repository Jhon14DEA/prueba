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
public class P_VechiculoTurismo  extends P_Vehiculo{
    
    private  int nPuertas;

    public P_VechiculoTurismo(int nPuertas, String matricula, String marca, String modelo) {
        super(matricula, marca, modelo);
        this.nPuertas = nPuertas;
    }

    public int getnPuertas() {
        return nPuertas;
    }

 
    @Override
    public String mostrarDatos(){
    return "Marca "+marca+"\nModelo"+modelo+"\nMatricula"+matricula +"\nNumero de puertas"+nPuertas+"\n";
    
    }

 
}
