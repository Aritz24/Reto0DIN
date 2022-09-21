/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto0din.model;

/**
 *
 * @author 2dam
 */
public class FactoriaModelo {
    
    public InterfazModelo getModel(String v){
        
        if (v.equalsIgnoreCase("Fichero")) {
            return new ImplementacionModelo();
        }else{
            return new ImplementacionModeloBD();
        }
        
    } 
    
    
}
