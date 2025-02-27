
package com.prueba_1.service;
import com.prueba_1.domain.Vehiculo;
import java.util.List;

/**
 *
 * @author Eduardo
 */

public interface VehiculoService {

    public List<Vehiculo> getVehiculos();
    

    public Vehiculo getVehiculo(int idVehiculo);
    
    public void save(Vehiculo vehiculo);
    
    public void update(Vehiculo vehiculo);
    
    public void delete(int idVehiculo);
    
}


   
