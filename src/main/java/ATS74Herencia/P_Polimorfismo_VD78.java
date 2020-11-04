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
public class P_Polimorfismo_VD78 {
    public static void main(String[] args) {
            
    P_Vehiculo carros[] = new P_Vehiculo[4];
    
   carros[0] = new P_Vehiculo("GH77", "RAPTOR", "A34");
    carros[1] = new P_VechiculoTurismo(1,"GH77", "RAPTOR", "A34");
    carros[2] = new P_VehiculoDeportivo(2, "GH77", "RAPTOR", "A34");
    carros[3] = new P_VechiculoTurismo(3,"GH77", "RAPTOR", "A34");
   for(P_Vehiculo carross : carros){
       System.out.println(carross.mostrarDatos());
}    System.out.println("");
    }
        
}
