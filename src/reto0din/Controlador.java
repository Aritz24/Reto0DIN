/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto0din;

import java.util.ResourceBundle;
import reto0din.model.InterfazModelo;
import reto0din.vista.InterfazVista;

/**
 *
 * @author 2dam
 */
public class Controlador{
    
    public void Run(InterfazModelo model, InterfazVista view){
        String dato;
        dato = model.cogerSaludo();
        view.mostrarSaludo(dato);
        
        
    }
   
}
