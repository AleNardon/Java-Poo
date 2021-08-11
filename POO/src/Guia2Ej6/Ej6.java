package Guia2Ej6;

import G2Entidades.Cafetera;
import cafetera.servicio.ServivioCafetera;

public class Ej6 {

    public static void main(String[] args) {
        ServivioCafetera sc = new ServivioCafetera();
        Cafetera caf = new Cafetera(123,233);
        
        sc.llenarCafetera(caf);
        sc.serviTaza(caf);
        
        
        
    }
    
}
