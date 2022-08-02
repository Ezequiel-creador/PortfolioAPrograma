package com.portfoliofinal.app.service;


import com.portfoliofinal.app.model.Servicios;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.portfoliofinal.app.repository.ServiciosRepository;


@Service

public class ServiciosService implements iServiciosService{
     @Autowired
   public ServiciosRepository serRepo;
     
    @Override
    public List<Servicios> verServicios() {
        return serRepo.findAll();
    }

    @Override
    public void crearServicios(Servicios ser) {
       serRepo.save(ser);
    }

    @Override
    public void borrarServicios(Long id) {
        serRepo.deleteById(id);
    }

    @Override
    public Servicios buscarServicios(Long id) {
       return serRepo.findById(id).orElse(null);
    }
}
