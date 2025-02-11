package es.accenture.ejercicioEmpleados;

public class Empleado {
    private String nif;
    private String nombre;
    private double sueldoBase;
    private int horasExtras;
    private double tipoIrpf;
    private boolean casado;
    private int numHijos;

    public static final double PAGO_HORA_EXTRA = 10.0;

    // Constructor vacío
    public Empleado() {}

    // Constructor con parámetros
    public Empleado(String nif, String nombre, double sueldoBase, int horasExtras, double tipoIrpf, boolean casado, int numHijos) {
        this.nif = nif;
        this.nombre = nombre;
        this.sueldoBase = sueldoBase;
        this.horasExtras = horasExtras;
        this.tipoIrpf = tipoIrpf;
        this.casado = casado;
        this.numHijos = numHijos;
    }

    // Constructor de copia
    public Empleado(Empleado otro) {
        this(otro.nif, otro.nombre, otro.sueldoBase, otro.horasExtras, otro.tipoIrpf, otro.casado, otro.numHijos);
    }

    // Getters y Setters
    public String getNif() { return nif; }
    public void setNif(String nif) { this.nif = nif; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public double getSueldoBase() { return sueldoBase; }
    public void setSueldoBase(double sueldoBase) { this.sueldoBase = sueldoBase; }

    public int getHorasExtras() { return horasExtras; }
    public void setHorasExtras(int horasExtras) { this.horasExtras = horasExtras; }

    public double getTipoIrpf() { return tipoIrpf; }
    public void setTipoIrpf(double tipoIrpf) { this.tipoIrpf = tipoIrpf; }

    public boolean isCasado() { return casado; }
    public void setCasado(boolean casado) { this.casado = casado; }

    public int getNumHijos() { return numHijos; }
    public void setNumHijos(int numHijos) { this.numHijos = numHijos; }

    // Métodos de cálculo
    public double calcularImporteHorasExtras() {
        return horasExtras * PAGO_HORA_EXTRA;
    }

    public double calcularSueldoBruto() {
        return sueldoBase + calcularImporteHorasExtras();
    }

    public double calcularRetencionIrpf() {
        double irpfReducido = tipoIrpf - (casado ? 2 : 0) - numHijos;
        return calcularSueldoBruto() * (irpfReducido / 100);
    }

    public double calcularSueldo() {
        return calcularSueldoBruto() - calcularRetencionIrpf();
    }

    @Override
    public String toString() {
        return "Datos del empleado: " + nif + " " + nombre +
                "\nSueldo Base: " + sueldoBase +
                "\nHoras Extras: " + horasExtras +
                "\nTipo IRPF: " + tipoIrpf +
                "\nCasado: " + casado +
                "\nNúmero de Hijos: " + numHijos;
    }
}

