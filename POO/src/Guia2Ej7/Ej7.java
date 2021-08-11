package Guia2Ej7;

import G2Entidades.Persona;
import persona.servicio.ServicioPersona;

public class Ej7 {
    public static int[]  auxi(){
        ServicioPersona sp = new ServicioPersona();
        Persona a1=sp.creaPers();
        Persona a2=sp.creaPers();
        Persona a3=sp.creaPers();
        Persona a4=sp.creaPers();
        int[] imcs = new int [4] ;
        imcs[0] =sp.calcularIMC(a1);
        imcs[1] =sp.calcularIMC(a2);
        imcs[2]=sp.calcularIMC(a3);
        imcs[3] =sp.calcularIMC(a4);
        
        return imcs;
        
    } 
    public static void main(String[] args) {
        ServicioPersona sp = new ServicioPersona();
        Persona a1 = sp.creaPers();
        
    }
    
    }   
