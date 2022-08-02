package com.portfoliofinal.app.controller;


import com.portfoliofinal.app.model.Servicios;
import com.portfoliofinal.app.service.iServiciosService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestServicios {
     @Autowired
 private iServiciosService serServ;    
  
 @PostMapping("/new/servicios")
public void agregarServicio(@RequestBody Servicios ser){
serServ.crearServicios(ser);
}
        
@GetMapping ("/ver/servicioss")
@ResponseBody
public List<Servicios> verServicioss(){
return serServ.verServicios();
}

}
