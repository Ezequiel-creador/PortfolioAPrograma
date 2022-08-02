package com.portfoliofinal.app.service;

import com.portfoliofinal.app.model.Acerca;
import com.portfoliofinal.app.repository.AcercaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service

public class AcercaService implements iAcercaService {
   @Autowired
   public AcercaRepository acerRepo;
    
   @Override
    public List<Acerca> verAcerca() {
        return acerRepo.findAll();
    }

    @Override
    public void crearAcerca(Acerca acer) {
       acerRepo.save(acer);
    }

    @Override
    public void borrarAcerca(Long id) {
        acerRepo.deleteById(id);
    }

    @Override
    public Acerca buscarAcerca(Long id) {
       return acerRepo.findById(id).orElse(null);
    }
      
}
