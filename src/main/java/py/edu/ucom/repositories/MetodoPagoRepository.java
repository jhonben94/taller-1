package py.edu.ucom.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import py.edu.ucom.entities.MetodoPago;

public interface MetodoPagoRepository extends JpaRepository<MetodoPago,Integer> {
    
}
