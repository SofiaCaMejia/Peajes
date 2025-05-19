package co.edu.uniquindio.demo;

public abstract class Vehiculo {
    protected String placa;
    protected double peajesPagados;
    protected TipoVehiculo tipo;
    protected Conductor conductor;

    public Vehiculo(String placa, Conductor conductor, TipoVehiculo tipo, double peajesPagados) {
        this.placa = placa;
        this.conductor = conductor;
        this.tipo = tipo;
        this.peajesPagados = peajesPagados;
    }

    //METODOS ADSTRACTOS

    public abstract double calcularPeajes();
    public abstract String getDescripcion();
    public abstract TipoVehiculo gettipo();

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Conductor getConductor() {
        return conductor;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
    }

    public TipoVehiculo getTipo() {
        return tipo;
    }

    public void setTipo(TipoVehiculo tipo) {
        this.tipo = tipo;
    }

    public double getPeajesPagados() {
        return peajesPagados;
    }

    public void setPeajesPagados(double peajesPagados) {
        this.peajesPagados = peajesPagados;
    }
    public void incrementarPeajesPagados() {
        this.peajesPagados++;
    }
}
