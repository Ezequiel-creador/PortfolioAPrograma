
package com.portfoliofinal.app.repository;


import com.portfoliofinal.app.model.Conocimientos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface ConocimientosRepository extends JpaRepository <Conocimientos, Long> {
    
}
