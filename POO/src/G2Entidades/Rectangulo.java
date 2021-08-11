
package G2Entidades;


public class Rectangulo {
   
    private int base ;
    private  int altura;

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
    /**
     * 
     * @return 
     */
    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    public int perimetro(){
        int peri = (base+altura)*2;
        return peri;
    }
    public int superficie(){
        int peri = perimetro();
        int supe = (base*altura)/peri;
        return supe;
    }
   
    public void imprime() {
        String bas = "";
        String mid ="";
        
        for (int i=0;i<base;++i) bas+="* ";
        mid+="*";
        for (int i=0;i<base-2;++i) mid+="  ";
        mid+=" *";
        System.out.println(bas);
        for (int i=0;i<altura-2;++i) System.out.println(mid);;
        System.out.println(bas);
        
        
    }
    
    
}
