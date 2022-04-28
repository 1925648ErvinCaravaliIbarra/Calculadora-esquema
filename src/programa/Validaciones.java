/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programa;

import javax.swing.JOptionPane;

/**
 *
 * @author ervin
 */
public class Validaciones {
    
    
    
    public static double esDouble(String valor )
    {
        double res =-1;
        try{
            res = Double.parseDouble(valor.trim());
        }catch(NumberFormatException nfe)
        {
            JOptionPane.showMessageDialog(null, "el dato ingresado es inválido");
        }
        return res;
    }
    
}

