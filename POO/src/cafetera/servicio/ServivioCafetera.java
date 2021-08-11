
package cafetera.servicio;

import G2Entidades.Cafetera;
import java.util.Scanner;

public class ServivioCafetera {
    private Scanner input = new Scanner(System.in).useDelimiter("\n");
    public void llenarCafetera(Cafetera c){
        int total = c.getCapacidadMaxima();
        c.setCapacidadActua(total);
        
    }
    
    public void serviTaza(Cafetera c){
        int total= c.getCapacidadMaxima();
        int act = c.getCapacidadActua();
        int met = total-act;
        int serv ;
        do {            
            System.out.println("Inserte la cantidad de cafe que desea servir:");
            serv = input.nextInt();
        } while (serv>met);
        
        c.setCapacidadActua(serv+act);
        System.out.println("La capacidad de la taza a quedado en "+ (serv+act) +"del total de "+total);
    
    }
    public void vaciarCafetera(Cafetera c){
        c.setCapacidadActua(0);
        System.out.println("Se ha vaciado la taza");
    }
    
}
