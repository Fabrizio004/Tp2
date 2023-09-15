package libro;

public class LibroDeTexto extends Libro {
    private String facultad;
    private int curso;

    public LibroDeTexto(String titulo, String autor, String facultad, int curso) {
        super(titulo, autor);
        this.facultad = facultad;
        this.curso = curso;
    }

    // Redefinición del método imprimirInfo para mostrar la información adicional
    @Override
    public void imprimirInfo() {
        super.imprimirInfo();
        System.out.println("Facultad: " + facultad);
        System.out.println("Curso: " + curso);
    }
}
