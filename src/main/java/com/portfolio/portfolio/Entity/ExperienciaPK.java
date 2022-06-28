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
public class ExperienciaPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "id_experiencia")
    private int idExperiencia;
    @Basic(optional = false)
    @NotNull
    @Column(name = "personas_idpersona")
    private int personasIdpersona;

    public ExperienciaPK() {
    }

    public ExperienciaPK(int idExperiencia, int personasIdpersona) {
        this.idExperiencia = idExperiencia;
        this.personasIdpersona = personasIdpersona;
    }

    public int getIdExperiencia() {
        return idExperiencia;
    }

    public void setIdExperiencia(int idExperiencia) {
        this.idExperiencia = idExperiencia;
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
        hash += (int) idExperiencia;
        hash += (int) personasIdpersona;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ExperienciaPK)) {
            return false;
        }
        ExperienciaPK other = (ExperienciaPK) object;
        if (this.idExperiencia != other.idExperiencia) {
            return false;
        }
        if (this.personasIdpersona != other.personasIdpersona) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.portfolio.portfolio.Entity.ExperienciaPK[ idExperiencia=" + idExperiencia + ", personasIdpersona=" + personasIdpersona + " ]";
    }
    
}
