/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.portfolio.Controller;
import com.portfolio.portfolio.DTO.IPersonasService;
import com.portfolio.portfolio.Entity.Personas;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Domingo
 */
@RestController
public class PersonasController {
    @Autowired IPersonasService ipersonasService;
    
    @GetMapping("personas/get")
    public List<Personas> getPersona(){
        return ipersonasService.getPersonas();
    }
    
    @PostMapping("personas/create")
    public String createPersona(@RequestBody Personas persona){
        ipersonasService.savePersona(persona);
        return "La persona fue creada exitosamente";
    }
    
    @DeleteMapping("personas/borrar/{id}")
    public String deletePersona(@PathVariable Integer id){
        ipersonasService.deletePersona(id);
        return "La persona fue eliminada exitosamente";
    }
    
    /**
     *
     * @param id
     * @param nuevoNombre
     * @param nuevoApellido
     * @return
     */
    @PutMapping("personas/editar/{id}")
    public Personas editPersona(@PathVariable Integer id,
                                @RequestParam("nombre") String nuevoNombre,
                                @RequestParam("apellido") String nuevoApellido){
        Personas persona=ipersonasService.findPersona(id);
        persona.setNombre(nuevoNombre);
        persona.setApellido(nuevoApellido);
        
        ipersonasService.savePersona(persona);
        return persona;
    }
}
