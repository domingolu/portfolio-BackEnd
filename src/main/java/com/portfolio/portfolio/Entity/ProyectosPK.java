/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.portfolio.Entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Domingo
 */
@Embeddable
public class ProyectosPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "id_proyecto")
    private int idProyecto;
    @Basic(optional = false)
    @NotNull
    @Column(name = "personas_idpersona")
    private int personasIdpersona;

    public ProyectosPK() {
    }

    public ProyectosPK(int idProyecto, int personasIdpersona) {
        this.idProyecto = idProyecto;
        this.personasIdpersona = personasIdpersona;
    }

    public int getIdProyecto() {
        return idProyecto;
    }

    public void setIdProyecto(int idProyecto) {
        this.idProyecto = idProyecto;
    }

    public int getPersonasIdpersona() {
        return personasIdpersona;
    }

    public void setPersonasIdpersona(int personasIdpersona) {
        this.personasIdpersona = personasIdpersona;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idProyecto;
        hash += (int) personasIdpersona;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProyectosPK)) {
            return false;
        }
        ProyectosPK other = (ProyectosPK) object;
        if (this.idProyecto != other.idProyecto) {
            return false;
        }
        if (this.personasIdpersona != other.personasIdpersona) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.portfolio.portfolio.Entity.ProyectosPK[ idProyecto=" + idProyecto + ", personasIdpersona=" + personasIdpersona + " ]";
    }
    
}
