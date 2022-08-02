 
package com.portfoliofinal.app.service;


import com.portfoliofinal.app.model.Conocimientos;
import java.util.List;





public interface iConocimientosService {
    public List<Conocimientos> verConocimientos ();
   public void crearConocimientos (Conocimientos cono);
   public void borrarConocimientos (Long id);
   public Conocimientos buscarConocimientos (Long id); 
}
