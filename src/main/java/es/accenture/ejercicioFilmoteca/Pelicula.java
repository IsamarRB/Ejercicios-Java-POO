package es.accenture.ejercicioFilmoteca;

public class Pelicula {
    private String titulo;
    private String genero;
    private String director;
    private boolean entregado;

    // Constructor vacío
    public Pelicula() {
        this.titulo = "";
        this.genero = "";
        this.director = "";
        this.entregado = false;
    }

    // Constructor con parámetros
    public Pelicula(String titulo, String genero, String director, boolean entregado) {
        this.titulo = titulo;
        this.genero = genero;
        this.director = director;
        this.entregado = entregado;
    }

    // Getters y Setters
    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getGenero() { return genero; }
    public void setGenero(String genero) { this.genero = genero; }

    public String getDirector() { return director; }
    public void setDirector(String director) { this.director = director; }

    public boolean isEntregado() { return entregado; }

    // Métodos de alquiler
    public boolean entregar() {
        if (!entregado) {
            entregado = true;
            return true;
        }
        return false;
    }

    public boolean devolver() {
        if (entregado) {
            entregado = false;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Película: " + titulo + "\nDirector: " + director + "\nGénero: " + genero +
                "\nDisponible: " + (entregado ? "No" : "Sí");
    }
}
