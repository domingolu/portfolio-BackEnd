/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.portfolio.DTO;

import com.portfolio.portfolio.Entity.Personas;
import java.util.List;

/**
 *
 * @author Domingo
 */
public interface IPersonasService {
    public List<Personas> getPersonas();
    public void savePersona(Personas persona);
    public void deletePersona (Integer id);
    public Personas findPersona (Integer id);
}
