package es.accenture.ejercicioFilmoteca;

public class Serie {
    private String titulo;
    private int numTemporadas;
    private boolean entregado;
    private String genero;
    private String creador;

    // Constructor vacío
    public Serie() {
        this.titulo = "";
        this.numTemporadas = 1;
        this.entregado = false;
        this.genero = "";
        this.creador = "";
    }

    // Constructor con parámetros
    public Serie(String titulo, int numTemporadas, String genero, String creador, boolean entregado) {
        this.titulo = titulo;
        this.numTemporadas = numTemporadas;
        this.genero = genero;
        this.creador = creador;
        this.entregado = entregado;
    }

    // Getters y Setters
    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public int getNumTemporadas() { return numTemporadas; }
    public void setNumTemporadas(int numTemporadas) { this.numTemporadas = numTemporadas; }

    public boolean isEntregado() { return entregado; }

    public String getGenero() { return genero; }
    public void setGenero(String genero) { this.genero = genero; }

    public String getCreador() { return creador; }
    public void setCreador(String creador) { this.creador = creador; }

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
        return "Serie: " + titulo + "\nCreador: " + creador + "\nGénero: " + genero +
                "\nNº de temporadas: " + numTemporadas + "\nDisponible: " + (entregado ? "No" : "Sí");
    }
}

