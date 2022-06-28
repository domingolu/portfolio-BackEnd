/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.portfolio.Service;

import com.portfolio.portfolio.DTO.IPersonasService;
import com.portfolio.portfolio.Entity.Personas;
import com.portfolio.portfolio.Repository.IPersonasRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Domingo
 */
@Service
public class PersonasService implements IPersonasService {
    @Autowired 
    private IPersonasRepository ipersonasRepository;

    @Override
    public List<Personas> getPersonas() {
        List<Personas> personas=ipersonasRepository.findAll();
        return personas;
    }

    @Override
    public void savePersona(Personas persona) {
        ipersonasRepository.save(persona);
    }

    @Override
    public void deletePersona(Integer id) {
        ipersonasRepository.deleteById(id);
        //qué pasa si no encuentra el id para borrar?
    }

    @Override
    public Personas findPersona(Integer id) {
       return ipersonasRepository.findById(id).orElse(null);
    }

}
