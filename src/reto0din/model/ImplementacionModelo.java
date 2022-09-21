/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto0din.model;

import java.io.File;
import java.util.ResourceBundle;
import java.util.Scanner;

/**
 *
 * @author 2dam
 */
public class ImplementacionModelo implements InterfazModelo{
    

    @Override   
    
    public String cogerSaludo() {
        
           return ResourceBundle.getBundle("reto0DIN.config").getString("dato");    
    }
    
}
