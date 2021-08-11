package G2Entidades;

public class Libro {
    //Atributos
    private String ISBN;
    private String Titulo;
    private String Autor;
    private int NumPag;

    public Libro(String ISBN, String Titulo, String Autor, int NumPag) {
        this.ISBN = ISBN;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.NumPag = NumPag;
    }

    public String toString() {
        return "Libro{" + "ISBN=" + ISBN + ", Titulo=" + Titulo + ", Autor=" + Autor + ", NumPag=" + NumPag + '}';
    }
    
}
