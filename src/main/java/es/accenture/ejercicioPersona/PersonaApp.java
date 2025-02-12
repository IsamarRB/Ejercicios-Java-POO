package es.accenture.ejercicioPersona;

import java.util.Scanner;

public class PersonaApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedimos los datos básicos
        System.out.print("Introduce el nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Introduce el sexo (H/M): ");
        char sexo = scanner.next().charAt(0);

        System.out.print("Introduce la edad: ");
        int edad = scanner.nextInt();

        // Inicializamos variables opcionales
        String dni = "";
        double peso = 0.0;
        double altura = 0.0;

        // Si la persona es mayor de edad, pedimos más datos
        if (edad >= 18) {
            scanner.nextLine(); // Consumimos la línea pendiente
            System.out.print("Introduce el DNI: ");
            dni = scanner.nextLine();

            System.out.print("Introduce el peso (kg): ");
            peso = scanner.nextDouble();

            System.out.print("Introduce la altura (m): ");
            altura = scanner.nextDouble();
        }

        // Creamos la instancia de Persona
        Persona persona = new Persona(nombre, sexo, edad, dni, peso, altura);

        // Mostramos la información
        System.out.println("\n" + persona);

        // Calculamos el IMC solo si es mayor de edad
        if (persona.esMayorDeEdad()) {
            System.out.println("IMC: " + persona.calcularIMC());
        }

        scanner.close();
    }
}