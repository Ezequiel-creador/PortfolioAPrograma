
package com.portfoliofinal.app.repository;


import com.portfoliofinal.app.model.Contacto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
/**
 *
 * @author ekiel
 */
public interface ContactoRepository extends JpaRepository <Contacto, Long>{
    
}
