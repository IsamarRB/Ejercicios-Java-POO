package es.accenture.ejercicioLibros;

public class Libro {
    private String titulo;
    private String isbn;
    private String autor;
    private int numPaginas;

    // Constructor vacío
    public Libro() {
        this.titulo = "";
        this.isbn = "";
        this.autor = "";
        this.numPaginas = 0;
    }

    // Constructor con parámetros
    public Libro(String titulo, String isbn, String autor, int numPaginas) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.autor = autor;
        this.numPaginas = numPaginas;
    }

    // Constructor de copia
    public Libro(Libro otro) {
        this(otro.titulo, otro.isbn, otro.autor, otro.numPaginas);
    }

    // Getters y Setters
    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getIsbn() { return isbn; }
    public void setIsbn(String isbn) { this.isbn = isbn; }

    public String getAutor() { return autor; }
    public void setAutor(String autor) { this.autor = autor; }

    public int getNumPaginas() { return numPaginas; }
    public void setNumPaginas(int numPaginas) { this.numPaginas = numPaginas; }

    @Override
    public String toString() {
        return "El libro \"" + titulo + "\" con ISBN " + isbn +
                " creado por el autor " + autor + " tiene " + numPaginas + " páginas.";
    }
}
