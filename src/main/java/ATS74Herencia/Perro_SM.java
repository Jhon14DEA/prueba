/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ATS74Herencia;

import java.sql.SQLOutput;

/**
 *
 * @author ASUS
 */
public class Perro_SM  extends Animal_SM{
    
    @Override
    public void comer(){
        System.out.println("Estoy comiendo croquetas");
    }
    
}
