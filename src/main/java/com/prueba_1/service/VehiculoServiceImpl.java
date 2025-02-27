package com.prueba_1.service;
import com.prueba_1.dao.VehiculoDao;
import com.prueba_1.domain.Vehiculo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Eduardo
 */

@Service
public class VehiculoServiceImpl implements VehiculoService {

    @Autowired
    private VehiculoDao vehiculoDao; 

    @Override
    @Transactional(readOnly = true)
    public List<Vehiculo> getVehiculos() {
        return vehiculoDao.findAll(); 
    }

    @Override
    @Transactional(readOnly = true)
    public Vehiculo getVehiculo(int idVehiculo) {
       return vehiculoDao.findById(idVehiculo).orElse(null);
    }

    @Override
    @Transactional
    public void save(Vehiculo vehiculo) {
        vehiculoDao.save(vehiculo); 
    }

    @Override
    @Transactional
    public void update(Vehiculo vehiculo) {
        vehiculoDao.save(vehiculo); 
    }

    @Override
    @Transactional
    public void delete(int idVehiculo) {
        vehiculoDao.deleteById(idVehiculo); 
    }
}
