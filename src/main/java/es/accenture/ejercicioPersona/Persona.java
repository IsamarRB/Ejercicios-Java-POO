package es.accenture.ejercicioPersona;

public class Persona {
    private String nombre;
    private char sexo;
    private int edad;
    private String dni;
    private double peso;
    private double altura;

    // Constructor vacío
    public Persona() {
        this.nombre = "";
        this.sexo = 'H'; // Valor por defecto
        this.edad = 0;
        this.dni = "";
        this.peso = 0.0;
        this.altura = 0.0;
    }

    // Constructor con parámetros
    public Persona(String nombre, char sexo, int edad, String dni, double peso, double altura) {
        this.nombre = nombre;
        setSexo(sexo); // Validamos el sexo en el setter
        this.edad = edad;
        this.dni = dni;
        this.peso = peso;
        this.altura = altura;
    }

    // Constructor de copia
    public Persona(Persona otra) {
        this(otra.nombre, otra.sexo, otra.edad, otra.dni, otra.peso, otra.altura);
    }

    // Getters y Setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public char getSexo() { return sexo; }
    public void setSexo(char sexo) {
        if (sexo == 'H' || sexo == 'M') {
            this.sexo = sexo;
        } else {
            this.sexo = 'H'; // Valor por defecto
        }
    }

    public int getEdad() { return edad; }
    public void setEdad(int edad) { this.edad = edad; }

    public String getDni() { return dni; }
    public void setDni(String dni) { this.dni = dni; }

    public double getPeso() { return peso; }
    public void setPeso(double peso) { this.peso = peso; }

    public double getAltura() { return altura; }
    public void setAltura(double altura) { this.altura = altura; }

    // Método que verifica si el sexo es válido
    public boolean comprobarSexo() {
        return (sexo == 'H' || sexo == 'M');
    }

    // Método que verifica si es mayor de edad
    public boolean esMayorDeEdad() {
        return edad >= 18;
    }

    // Método que calcula el IMC
    public String calcularIMC() {
        if (altura <= 0) {
            return "Altura inválida.";
        }
        double imc = peso / (altura * altura);
        if (imc < 20) {
            return "Está por debajo de su peso ideal.";
        } else if (imc >= 20 && imc <= 25) {
            return "Está en su peso ideal.";
        } else {
            return "Tiene sobrepeso.";
        }
    }

    @Override
    public String toString() {
        String info = "Datos personales\n" +
                "Nombre: " + nombre + "\n" +
                "Sexo: " + (sexo == 'H' ? "Hombre" : "Mujer") + "\n" +
                "Edad: " + edad + "\n";

        if (esMayorDeEdad()) {
            info += "DNI: " + dni + "\n" +
                    "Peso: " + peso + "\n" +
                    "Altura: " + altura + "\n";
        }
        return info;
    }
}
