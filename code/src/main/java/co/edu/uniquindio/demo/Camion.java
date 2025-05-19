package co.edu.uniquindio.demo;

public abstract class Camion extends Vehiculo {
    public int ejes;
    public double capacidadCarga;

    public Camion(String placa, Conductor conductor, TipoVehiculo tipo, double peajesPagados, int ejes, double capacidadCarga) {
        super(placa, conductor, tipo, peajesPagados);
        this.ejes = ejes;
        this.capacidadCarga = capacidadCarga;
    }
    public double calcularPeaje(){
        double tarifa = ejes * 7000;
        if (capacidadCarga > 10){
            tarifa *= 1.10;
        }
        return tarifa;
    }

    public int getEjes() {
        return ejes;
    }

    public void setEjes(int ejes) {
        this.ejes = ejes;
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }
}
