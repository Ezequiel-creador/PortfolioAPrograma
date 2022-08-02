
package com.portfoliofinal.app.repository;


import com.portfoliofinal.app.model.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
@Repository
public interface EducacionRepository extends JpaRepository <Educacion, Long>{
    
}
