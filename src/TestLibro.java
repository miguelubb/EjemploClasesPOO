public class TestLibro {
    public static void main(String[] args) {
        Libro principito=new Libro("El principito", 150, "novela");
        Libro cds=new Libro("Compact data Structures", 553, "Informática");
        System.out.println(principito.obtieneNombre());
        System.out.println(cds.obtieneNombre());
        cds.cambiaGenero("Computer Science");
        System.out.println(cds.obtieneGenero());

    }
}
