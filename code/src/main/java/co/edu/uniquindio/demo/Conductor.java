package co.edu.uniquindio.demo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Conductor extends Usuario{
    private List<Vehiculo> vehiculos;

    public Conductor(String nombre, String apellido, String documentoIdentidad, LocalDate fechaNacimiento, List<Vehiculo> vehiculos) {
        super(nombre, apellido, documentoIdentidad, fechaNacimiento);
        this.vehiculos = new ArrayList<>();
    }
    public void asignarVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
    }
    public List<Vehiculo>getVehiculosPorTipo(TipoVehiculo tipo) {
        List<Vehiculo> filtrados = new ArrayList<>();
        for(Vehiculo vehiculo : vehiculos) {
            if(vehiculo.getTipo()== tipo) {
                filtrados.add(vehiculo);
            }
        }
        return filtrados;
    }

    public List<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(List<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }
}
