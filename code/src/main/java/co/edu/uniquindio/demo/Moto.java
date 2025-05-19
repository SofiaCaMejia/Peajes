package co.edu.uniquindio.demo;

public abstract class Moto extends Vehiculo {
    private double cilidraje;

    public Moto(String placa, Conductor conductor, TipoVehiculo tipo, double peajesPagados, double cilidraje) {
        super(placa, conductor, tipo, peajesPagados);
        this.cilidraje = cilidraje;
    }

    public double calcularPeaje(){
        double tarifa = 5000;
        if (cilidraje > 200){
            tarifa += 200;

        }
        return tarifa;
    }

    public double getCilidraje() {
        return cilidraje;
    }

    public void setCilidraje(double cilidraje) {
        this.cilidraje = cilidraje;
    }
}
