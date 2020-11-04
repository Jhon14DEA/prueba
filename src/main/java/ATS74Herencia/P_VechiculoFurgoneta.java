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
public class P_VechiculoFurgoneta  extends P_Vehiculo{
    
    private int carga;

    public P_VechiculoFurgoneta(int carga, String matricula, String marca, String modelo) {
        super(matricula, marca, modelo);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }
    
      @Override
    public String mostrarDatos(){
    return "Marca "+marca+"\nModelo"+modelo+"\nMatricula"+matricula +"\nCarga"+carga+"\n";
    }
    
}
