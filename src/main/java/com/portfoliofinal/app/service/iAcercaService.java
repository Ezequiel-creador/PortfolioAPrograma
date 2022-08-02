package com.portfoliofinal.app.service;


import com.portfoliofinal.app.model.Acerca;
import java.util.List;


public interface iAcercaService {
   public List<Acerca> verAcerca ();
   public void crearAcerca (Acerca acer);
   public void borrarAcerca (Long id);
   public Acerca buscarAcerca (Long id);
}
