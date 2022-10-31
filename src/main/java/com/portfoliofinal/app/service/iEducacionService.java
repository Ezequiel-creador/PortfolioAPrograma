package com.portfoliofinal.app.service;


import com.portfoliofinal.app.model.Educacion;
import java.util.List;


public interface iEducacionService {
   public List<Educacion> verEducacion ();
   public void crearEducacion (Educacion edu);
   public void borrarEducacion (Long id);
   public Educacion buscarEducacion (Long id);
   
    
}
