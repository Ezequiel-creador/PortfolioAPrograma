package com.portfoliofinal.app.service;


import com.portfoliofinal.app.model.Servicios;
import java.util.List;

/**
 *
 *
 */
   public interface iServiciosService {
   public List<Servicios> verServicios ();
   public void crearServicios (Servicios ser);
   public void borrarServicios (Long id);
   public Servicios buscarServicios (Long id);  
   
}
