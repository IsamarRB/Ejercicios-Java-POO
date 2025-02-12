package es.accenture.ejercicioFilmoteca;

public class Alquiler {
    public static void main(String[] args) {
        // Crear listas
        Serie[] listaSeries = {
                new Serie("Juego de Tronos", 8, "Aventuras", "George R. R. Martin", false),
                new Serie("Los Simpsons", 25, "Humor", "Matt Groening", false),
                new Serie("Padre de Familia", 12, "Humor", "Seth MacFarlane", false),
                new Serie("Breaking Bad", 5, "Thriller", "Vince Gilligan", false)
        };

        Pelicula[] listaPeliculas = {
                new Pelicula("Memorias de una Geisha", "Drama", "Rob Marshall", false),
                new Pelicula("La milla verde", "Drama/Fantástico", "Frank Darabont", false),
                new Pelicula("Hermanos por pelotas", "Comedia", "Adam McKay", false),
                new Pelicula("El resplandor", "Terror", "Stanley Kubrick", false)
        };

        // Alquilar algunas series y películas
        listaSeries[0].entregar(); // Juego de Tronos
        listaSeries[2].entregar(); // Padre de Familia
        listaPeliculas[1].entregar(); // La milla verde
        listaPeliculas[3].entregar(); // El resplandor

        // Devolver una
        listaPeliculas[1].devolver(); // Devolvemos La milla verde

        // Mostrar series disponibles
        System.out.println("\nSeries disponibles:");
        for (Serie s : listaSeries) {
            if (!s.isEntregado()) {
                System.out.println(s);
            }
        }

        // Mostrar películas disponibles
        System.out.println("\nPelículas disponibles:");
        for (Pelicula p : listaPeliculas) {
            if (!p.isEntregado()) {
                System.out.println(p);
            }
        }

        // Mostrar series alquiladas
        System.out.println("\nSeries alquiladas:");
        for (Serie s : listaSeries) {
            if (s.isEntregado()) {
                System.out.println(s);
            }
        }

        // Mostrar películas alquiladas
        System.out.println("\nPelículas alquiladas:");
        for (Pelicula p : listaPeliculas) {
            if (p.isEntregado()) {
                System.out.println(p);
            }
        }

        // Contar total de alquiladas
        int totalAlquiladas = 0;
        for (Serie s : listaSeries) if (s.isEntregado()) totalAlquiladas++;
        for (Pelicula p : listaPeliculas) if (p.isEntregado()) totalAlquiladas++;

        System.out.println("\nTotal de series y películas alquiladas: " + totalAlquiladas);
    }
}
