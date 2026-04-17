package domain;

public class VehiculoCombustible extends Vehiculo {
    private double kilometrosPorLitro;
    private double litrosExtra;

    public VehiculoCombustible(String patente, Marca marca, String modelo, int anio, double capacidadCarga,
            Sucursal sucursal, double kilometrosPorLitro, double litrosExtra) {
        super(patente, marca, modelo, anio, capacidadCarga, sucursal, VehiculoTipo.COMBUSTIBLE);
        this.kilometrosPorLitro = kilometrosPorLitro;
        this.litrosExtra = litrosExtra;
    }
    
     public double getKilometrosPorLitro() {
        return kilometrosPorLitro;
    }

    public double getLitrosExtra() {
        return litrosExtra;
    }

    @Override
    public double calcularConsumo(double kilometros) {
        double consumoBase = kilometros/kilometrosPorLitro;
        double extra = (2026 - anio >5) ? (kilometros / 15) * litrosExtra : 0;

        return consumoBase + extra;
    }
}