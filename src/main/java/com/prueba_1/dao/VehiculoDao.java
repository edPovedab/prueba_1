package com.prueba_1.dao;
import com.prueba_1.domain.Vehiculo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Eduardo
 */
public interface VehiculoDao extends JpaRepository<Vehiculo, Integer> {

    
    
}