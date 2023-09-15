package libro;
public class Novela {

    private String titulo;
    private String autor;
    private TipoNovela tipo;
    private double precio;

    public Novela(String titulo, String autor, TipoNovela tipo) {
        this.titulo = titulo;
        this.autor = autor;
        this.tipo = tipo;
        this.precio = 0.0; // Precio inicializado a 0
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void imprimirInfo() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Tipo de Novela: " + tipo);
        System.out.println("Precio: " + precio);
    }

    public enum TipoNovela {
        HISTORICA,
        ROMANTICA,
        POLICIACA,
        REALISTA,
        CIENCIA_FICCION,
        AVENTURAS
    }
}

