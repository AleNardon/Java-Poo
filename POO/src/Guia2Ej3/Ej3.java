/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia2Ej3;

import G2Entidades.Operacion;

/**
 *
 * @author alejo
 */
public class Ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Operacion op1 = new Operacion(10,0);
         
        
        System.out.println("suma "+op1.sumar());
        System.out.println("resta "+op1.restar());
        System.out.println("multi "+op1.multiplicar());
        System.out.println("divi "+op1.dividir());
        
    }
    
}
