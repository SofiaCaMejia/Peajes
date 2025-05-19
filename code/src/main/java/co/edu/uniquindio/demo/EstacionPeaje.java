package co.edu.uniquindio.demo;

import java.util.List;
import java.util.Locale;

public class EstacionPeaje {
    private String nombre;
    private String departamento;
    private String descripcion;
    private double totalRecaudado;
    private List<Vehiculo> vehiculosAtendidos;
    private List<Recaudador> recaudadores;

    public EstacionPeaje(String nombre, List<Recaudador> recaudadores, List<Vehiculo> vehiculosAtendidos, double totalRecaudado, String descripcion) {
        this.nombre = nombre;
        this.recaudadores = recaudadores;
        this.vehiculosAtendidos = vehiculosAtendidos;
        this.totalRecaudado = totalRecaudado;
        this.descripcion = descripcion;
    }
    public void imprimirListadoVehiculos() {
        System.out.println("Reporte Peaje");
        System.out.println("Estacion: " + nombre + "" + departamento + "" );
        for (Vehiculo vehiculo : vehiculosAtendidos) {
            System.out.println("tipo" + vehiculo.gettipo() +" " + vehiculo.getDescripcion()+ "" +vehiculo.calcularPeajes());

        }
    }
    public void registrarPaso(Vehiculo vehiculo) {
        double peaje = vehiculo.calcularPeajes();
        totalRecaudado += peaje;
        vehiculosAtendidos.add(vehiculo);
        vehiculo.incrementarPeajesPagados();
    }
    public Recaudador buscarRecaudador(String nombre) {
        String nombreRecaudador = nombre.trim().toLowerCase();
        for (Recaudador recaudador : recaudadores) {
            if (recaudador.getNombre().equals(nombreRecaudador)) {
                return recaudador;
            }
        }
        return null;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Recaudador> getRecaudadores() {
        return recaudadores;
    }

    public void setRecaudadores(List<Recaudador> recaudadores) {
        this.recaudadores = recaudadores;
    }

    public List<Vehiculo> getVehiculosAtendidos() {
        return vehiculosAtendidos;
    }

    public void setVehiculosAtendidos(List<Vehiculo> vehiculosAtendidos) {
        this.vehiculosAtendidos = vehiculosAtendidos;
    }

    public double getTotalRecaudado() {
        return totalRecaudado;
    }

    public void setTotalRecaudado(double totalRecaudado) {
        this.totalRecaudado = totalRecaudado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
