package es.accenture.ejercicioLibros;

public class LibroApp {
    public static void main(String[] args) {
        // Crear libros
        Libro[] libros = {
                new Libro("El resplandor", "9788490328729", "Stephen King", 688),
                new Libro("El cementerio de animales", "9788497930994", "Stephen King", 488),
                new Libro("El código Da Vinci", "9788408176022", "Dan Brown", 624),
                new Libro("Inferno", "9788408176039", "Dan Brown", 640)
        };

        // Mostrar todos los libros
        System.out.println("Lista de libros disponibles:");
        for (Libro libro : libros) {
            System.out.println(libro);
        }

        // Identificar el libro con más páginas
        Libro libroMayor = libros[0];
        for (Libro libro : libros) {
            if (libro.getNumPaginas() > libroMayor.getNumPaginas()) {
                libroMayor = libro;
            }
        }
        System.out.println("\nLibro con más páginas:\n" + libroMayor);

        // Mostrar solo los libros de Stephen King
        System.out.println("\nLibros de Stephen King:");
        for (Libro libro : libros) {
            if (libro.getAutor().equalsIgnoreCase("Stephen King")) {
                System.out.println(libro);
            }
        }
    }
}
