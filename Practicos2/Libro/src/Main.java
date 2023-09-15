import libro.Libro;
import libro.LibroDeTexto;
import libro.Novela;

public class Main {
    public static void main(String[] args) {
        Libro libro1 = new Libro("Libro 1", "Autor 1");
        libro1.setPrecio(20.0);

        LibroDeTexto libroDeTexto1 = new LibroDeTexto("Libro de Texto 1", "Autor 2", "Facultad A", 1);
        libroDeTexto1.setPrecio(40.0);

        Novela novela1 = new Novela("Novela 1", "Autor 2", Novela.TipoNovela.HISTORICA);
        novela1.setPrecio(15.0);


        System.out.println("Información del Libro:");
        libro1.imprimirInfo();

        System.out.println("\nInformación del Libro de Texto:");
        libroDeTexto1.imprimirInfo();

        System.out.println("\nInformación de la Novela:");
        novela1.imprimirInfo();
    }
}
