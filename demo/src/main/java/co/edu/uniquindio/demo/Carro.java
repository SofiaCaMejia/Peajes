package co.edu.uniquindio.demo;

public abstract class Carro extends Vehiculo {
    private TipoVehiculo tipo;

    public Carro(String placa, Conductor conductor, TipoVehiculo tipo, double peajesPagados) {
        super(placa, conductor, tipo, peajesPagados);
        this.tipo = tipo;
    }


    public double calcularPeaje() {
        double tarifa = 10000;//tarifa base

        if (tipo == TipoCarro.ELECTRICO) {
            tarifa *= 0.8;//20%
        } else if (tipo == TipoCarro.SERVICIO_PUBLICO) {
            tarifa *= 1.15; //15%
        }
        return tarifa;

    }
    public String getDescripcion() {
        
    }

    @Override
    public TipoVehiculo getTipo() {
        return tipo;
    }

    @Override
    public void setTipo(TipoVehiculo tipo) {
        this.tipo = tipo;
    }
}
