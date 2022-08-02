package com.portfoliofinal.app.controller;


import com.portfoliofinal.app.model.Acerca;
import com.portfoliofinal.app.service.iAcercaService;
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
public class Controller {
    
 @Autowired
 private iAcercaService acerServ;    
  
 @PostMapping("/new/acerca")
public void agregarAcerca(@RequestBody Acerca acer){
acerServ.crearAcerca(acer);
}
    
@GetMapping ("/ver/acercas")
@ResponseBody
public List<Acerca> verAcercas(){
return acerServ.verAcerca();
}

  @DeleteMapping("/delete/{id}")
   public void borrarAcerca (@PathVariable Long id) {
acerServ.borrarAcerca(id);
   }
   
   @GetMapping ("/buscar/acerca/perfil")
     public Acerca buscarAcerca() {
    return acerServ.buscarAcerca((long)1);
  
   }

   
   
  
   
   
 


   
   
   
   
 
   
}

