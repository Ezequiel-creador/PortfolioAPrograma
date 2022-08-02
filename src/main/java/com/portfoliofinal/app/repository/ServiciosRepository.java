
package com.portfoliofinal.app.repository;


import com.portfoliofinal.app.model.Servicios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface ServiciosRepository extends JpaRepository <Servicios, Long> {
    
}
