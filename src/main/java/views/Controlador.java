package views;

import data.Persistencia;
import domain.Vehiculo;
import domain.VehiculoTipo;
import java.util.ArrayList;
import java.util.Map;
import java.util.Optional;

public class Controlador {
    
    public static ArrayList<VehiculoViewModel> getVehiculos(){
        ArrayList<VehiculoViewModel> vehiculos = new ArrayList<>();
        for(Vehiculo vehiculo : Persistencia.getVehiculos()) {
            vehiculos.add(new VehiculoViewModel(vehiculo));
        }
        return vehiculos;
    }
    
    public static double[] calcularConsumos(Map<String, Double> vehiculos){
        double consumoElectricos = 0;
        double consumoCombustible= 0;
        for(Map.Entry<String, Double> entry : vehiculos.entrySet()){
           double consumo = 0;
           Optional<Vehiculo> vehiculo = Persistencia.getVehiculo(entry.getKey());
           if(vehiculo.isPresent()){
               consumo = vehiculo.get().calcularConsumo(entry.getValue());
               consumoElectricos += vehiculo.get().esDe(VehiculoTipo.ELECTRICO) ? consumo : 0;
               consumoCombustible += vehiculo.get().esDe(VehiculoTipo.COMBUSTIBLE) ? consumo : 0;
           }
        }
        return new double[] {consumoElectricos, consumoCombustible};
    }

    public static void agregarVehiculo(String patente, String nombreMarca, String paisMarca, 
        String modelo, int anio, double capacidad, int indexSucursal, String tipo, 
        double kmLitro, double litrosExtra, double kwh) {
    
    	domain.Marca marca = new domain.Marca(nombreMarca, paisMarca);
    	domain.Sucursal sucursal = Persistencia.getSucursales().get(indexSucursal);
    	domain.Vehiculo nuevoVehiculo;

    	if (tipo.equals("ELÉCTRICO")) {
        	nuevoVehiculo = new domain.VehiculoElectrico(patente, marca, modelo, anio, capacidad, sucursal, kwh);
    	} 
	else {
        	nuevoVehiculo = new domain.VehiculoCombustible(patente, marca, modelo, anio, capacidad, sucursal, kmLitro, litrosExtra);
   	}

    	Persistencia.getVehiculos().add(nuevoVehiculo);
    }

}
	
