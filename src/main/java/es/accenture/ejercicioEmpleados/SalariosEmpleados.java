package es.accenture.ejercicioEmpleados;

public class SalariosEmpleados {
    public static void main(String[] args) {
        // Empleado 1
        Empleado emp1 = new Empleado("12345678A", "Lucas Guerrero Arjona", 1150.00, 4, 15.0, true, 2);
        System.out.println(emp1);
        System.out.println("Sueldo Neto: " + emp1.calcularSueldo());

        // Empleado 2
        Empleado emp2 = new Empleado("11111111H", "Francisco Perez Antón", 1150.00, 4, 15.0, false, 0);
        System.out.println("\n" + emp2);
        System.out.println("Sueldo Neto: " + emp2.calcularSueldo());

        // Empleado 3
        Empleado emp3 = new Empleado("22222222G", "Marta Antón Sanz", 1150.00, 0, 15.0, true, 0);
        System.out.println("\n" + emp3);
        System.out.println("Sueldo Neto: " + emp3.calcularSueldo());
    }
}
