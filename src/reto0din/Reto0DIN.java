/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto0din;

import java.util.ResourceBundle;
import reto0din.model.FactoriaModelo;
import reto0din.vista.FactoriaVista;

/**
 *
 * @author 2dam
 */
public class Reto0DIN {

        
    public static void main(String[] args) {
        // TODO code application logic here 
        
        String tipo_dato = ResourceBundle.getBundle("Reto0DIN.config").getString("tipo_dato");
        
        String tipo_vista = ResourceBundle.getBundle("Reto0DIN.config").getString("tipo_vista");
        
       FactoriaModelo modelo = new FactoriaModelo();
       FactoriaVista vista = new FactoriaVista();
        
       Controlador control = new Controlador();
       control.Run(modelo.getModel(tipo_dato),vista.getView(tipo_vista));
        
    }
    
}
