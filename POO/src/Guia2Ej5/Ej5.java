package Guia2Ej5;

import G2Entidades.Cuenta;
import cuenta.servicio.ServicioCuenta;
import java.util.Scanner;

public class Ej5 {

    public static void main(String[] args) {
        ServicioCuenta sc = new ServicioCuenta();
        
        Cuenta cc = sc.creaCuenta();
        
        
        System.out.println(cc.toString());
        
        sc.ingresar(cc);
        
        System.out.println(cc.toString());
        
        sc.retirar(cc);
        System.out.println(cc.toString());       
        
        
        sc.extraccionRapida(cc);
        sc.consultaSaldo(cc);
    }
    
}
