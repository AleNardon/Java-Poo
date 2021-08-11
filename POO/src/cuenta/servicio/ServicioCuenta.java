package cuenta.servicio;
import G2Entidades.Cuenta;
import java.util.Scanner;



public class ServicioCuenta {
    private Scanner input = new Scanner(System.in).useDelimiter("\n");
    
    public Cuenta  creaCuenta(){
        System.out.print("Ingrese el numero de cuenta: ");
        int numeroCuenta = input.nextInt();
        
        System.out.print("Ingrese el Dni de la cuenta: ");
        long Dni = input.nextLong();
        
        System.out.print("Ingrese el saldo de la cuenta: ");
        double Saldo = input.nextDouble();
        
        return new Cuenta(numeroCuenta,Dni,Saldo);
    }
    
    public void ingresar(Cuenta c){
        System.out.print("Ingese la cantidad de dinero que desea ingresar al saldo: ");
        double plus = input.nextDouble();
        double total = c.getSaldo();
        c.setSaldo(total+plus);
    }
    public void retirar(Cuenta c){
        System.out.print("Ingese la cantidad de dinero que desea retirar: ");
        double saca = input.nextDouble();
        double total = c.getSaldo();
        if(saca>total){
            System.out.println("La cantidad que desea retirar es mayor a la que tiene disponible es mayor");
            System.out.println("Se retiraran $"+total+" pesos . Y el saldo de su cuenta quedara en 0");
            c.setSaldo(0);
        }
        else{
            double retira= total-saca;
            System.out.println("Se han retirado"+saca+". Y en su cuenta ha quedado un total de "+retira+" pesos.");
            c.setSaldo(retira);
        }  
    }
    public void extraccionRapida(Cuenta c){
        double total = c.getSaldo();
        double maxRet = (total*20)/100;
        System.out.println("Recuerde q por ser un retiro rapido no podra sacar mas del 20% de su cuenta");
        System.out.print("Ingese la cantidad de dinero que desea retirar: ");
        double saca = input.nextDouble();
        
        while (saca>maxRet){
            System.out.println("Monto ingresado incorrecto");
            System.out.println("Recuerde q por ser un retiro rapido no podra sacar mas del 20% de su cuenta");
            System.out.print("Ingese la cantidad de dinero que desea retirar: ");
            saca = input.nextDouble();
        }
        c.setSaldo(total-saca);
    }
    public void consultaSaldo(Cuenta c){
        System.out.println("El saldo de su cuenta es: "+c.getSaldo());
    }
    public void consultaDato(Cuenta c){
        System.out.println("Los datos de la cuenta son Numero de cuenta: "+c.getNumeroCuenta()+". Y DNI: "+c.getDni());
    }
}
