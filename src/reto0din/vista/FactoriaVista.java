/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto0din.vista;

/**
 *
 * @author 2dam
 */
public class FactoriaVista {
    
    public InterfazVista getView(String v){
        if(v.equalsIgnoreCase("Texto")){
            return new ImplementacionVista();
        }else{
            return new ImplementacionVistaVentana();
        }
    }
}
