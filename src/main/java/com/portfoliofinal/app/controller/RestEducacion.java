
package com.portfoliofinal.app.controller;


import com.portfoliofinal.app.model.Educacion;
import com.portfoliofinal.app.service.iEducacionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class RestEducacion {
    
 @Autowired
 private iEducacionService eduServ;    
  
 @PostMapping("/new/educacion")
public void agregarEducacion(@RequestBody Educacion edu){
eduServ.crearEducacion(edu);
}
    
@GetMapping ("/ver/educaciones")
@ResponseBody
public List<Educacion> verEducaciones(){
return eduServ.verEducacion();
}

  @DeleteMapping("/deleteEducacion/{id}")
   public void borrarEducacion (@PathVariable Long id) {
eduServ.borrarEducacion(id);
   }
   
   @GetMapping ("/buscar/educacion/perfil")
     public Educacion buscarEducacion() {
    return eduServ.buscarEducacion((long)1);
  
   }
}