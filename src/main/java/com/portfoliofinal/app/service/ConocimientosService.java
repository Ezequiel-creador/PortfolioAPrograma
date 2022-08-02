package com.portfoliofinal.app.service;


import com.portfoliofinal.app.model.Conocimientos;
import com.portfoliofinal.app.repository.ConocimientosRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service

public class ConocimientosService implements iConocimientosService {
   @Autowired
   public ConocimientosRepository conoRepo;
    @Override
    public List<Conocimientos> verConocimientos() {
        return conoRepo.findAll();
    }
    @Override
    public void crearConocimientos(Conocimientos cono) {
       conoRepo.save(cono);
    }

    @Override
    public void borrarConocimientos(Long id) {
        conoRepo.deleteById(id);
    }

    @Override
    public Conocimientos buscarConocimientos(Long id) {
       return conoRepo.findById(id).orElse(null);
    }
      
}
