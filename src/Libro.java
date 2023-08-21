public class Libro {
    //atributos
    //basado en el principio de encapsulamiento que es un pilar de la POO
    //todos los atributos son privados.
    private String nombre;
    private int nroPagina;
    private String genero;

    //constructor
    public Libro(String nom, int p, String g ){
        nombre=nom;
        nroPagina=p;
        genero=g;
    }
    //operaciones
    public String obtieneNombre(){
        return nombre;
    }

    public String obtieneGenero(){
        return genero;
    }
    public void cambiaGenero(String nvoGenero){
        genero=nvoGenero;
    }


}
