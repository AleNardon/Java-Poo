package persona.servicio;
import G2Entidades.Persona;
import java.util.Scanner;

public class ServicioPersona {
    private Scanner input = new Scanner(System.in).useDelimiter("\n");
    
    public Persona creaPers(){
        Persona per=new Persona();
        System.out.println("introduzaca el nombre: ");
        String nom=input.next();
        per.setNombre(nom);
        
        System.out.println("introduzaca la edad: ");
        int ed = input.nextInt();
        per.setEdad(ed);
        
        String sex;
        do{
            System.out.println("introduzaca el sexo: ");
            sex =input.next();
            
        }while(!sex.equals('H') && !sex.equals('M') && !sex.equals('O') );
        per.setSexo(sex);
        
        System.out.println("introduzaca el peso: ");
        int pes = input.nextInt();
        per.setPeso(pes);
        
        System.out.println("introduzaca la altura: ");
        int alt = input.nextInt();
        per.setAltura(alt);
        
        return per;
    }
    public int calcularIMC(Persona per){
        int pes=per.getPeso();
        int alt=per.getAltura();
        
        double imc=pes/Math.pow(alt, 2);
        
        if (imc<20) return -1;
        else if(imc>=20 &&imc<=25)return 0;
        else return 1;
    }
    public boolean esMayorDeEdad(Persona per){
        int ed=per.getEdad();
        if(ed>=18) return true;
        else return false;
    }
}
