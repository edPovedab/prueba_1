package com.prueba_1.domain;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.Data;

/**
 *
 * @author Eduardo
 */

@Data
@Entity
@Table(name = "vehiculo")
public class Vehiculo implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name="id_vehiculo")
    private int idVehiculo;
    private String descripcion;
    private String fechaSalida;

    public Vehiculo(int idVehiculo, String descripcion, String fechaSalida) {
        this.idVehiculo = idVehiculo;
        this.descripcion = descripcion;
        this.fechaSalida = fechaSalida;
    }
    
    public Vehiculo(){}
    
}
