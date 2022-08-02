package com.portfoliofinal.app.service;


import com.portfoliofinal.app.model.Contacto;
import java.util.List;


public interface iContactoService {
     public List<Contacto> verContacto ();
   public void crearContacto (Contacto con);
   public void borrarContacto (Long id);
   public Contacto buscarContacto (Long id);
}
