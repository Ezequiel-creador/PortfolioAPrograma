package com.portfoliofinal.app.controller;


import com.portfoliofinal.app.model.Conocimientos;
import com.portfoliofinal.app.service.iConocimientosService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class RestConocimientos {
  
   @Autowired
 private iConocimientosService conoServ;    
  
 @PostMapping("/new/conocimientos")
public void agregarConocimientos(@RequestBody Conocimientos cono){
conoServ.crearConocimientos(cono);
}
        
@GetMapping ("/ver/conocimientoss")
@ResponseBody
public List<Conocimientos> verConocimientoss(){
return conoServ.verConocimientos();
}

   
   
    
    
    
    
    
    
}

