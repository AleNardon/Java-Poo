package G2Entidades;


public class Cafetera {
    private int capacidadMaxima;
    private int capacidadActua;

    public Cafetera() {
    }

    public Cafetera(int capacidadMaxima, int capacidadActua) {
        this.capacidadMaxima = capacidadMaxima;
        this.capacidadActua = capacidadActua;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCapacidadActua() {
        return capacidadActua;
    }

    public void setCapacidadActua(int capacidadActua) {
        this.capacidadActua = capacidadActua;
    }
    
    
    
}
