package co.edu.uniquindio.demo;

import java.time.LocalDate;

public class Recaudador extends Usuario{
    private double sueldoMensual;

    public Recaudador(String nombre, String apellido, String documentoIdentidad, LocalDate fechaNacimiento, double sueldoMensual) {
        super(nombre, apellido, documentoIdentidad, fechaNacimiento);
        this.sueldoMensual = sueldoMensual;
    }

    public double getSueldoMensual() {
        return sueldoMensual;
    }

    public void setSueldoMensual(double sueldoMensual) {
        this.sueldoMensual = sueldoMensual;
    }
}
