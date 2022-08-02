 
package com.portfoliofinal.app.service;


import com.portfoliofinal.app.model.Experiencia;
import java.util.List;


/**
 *
 * @author ekiel
 */
public interface iExperienciaService {
      public List<Experiencia> verExperiencia ();
   public void crearExperiencia (Experiencia exp);
   public void borrarExperiencia (Long id);
   public Experiencia buscarExperiencia (Long id);  
   
}
