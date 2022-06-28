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
public class EducacionPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "id_educacion")
    private int idEducacion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "personas_idpersona")
    private int personasIdpersona;

    public EducacionPK() {
    }

    public EducacionPK(int idEducacion, int personasIdpersona) {
        this.idEducacion = idEducacion;
        this.personasIdpersona = personasIdpersona;
    }

    public int getIdEducacion() {
        return idEducacion;
    }

    public void setIdEducacion(int idEducacion) {
        this.idEducacion = idEducacion;
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
        hash += (int) idEducacion;
        hash += (int) personasIdpersona;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EducacionPK)) {
            return false;
        }
        EducacionPK other = (EducacionPK) object;
        if (this.idEducacion != other.idEducacion) {
            return false;
        }
        if (this.personasIdpersona != other.personasIdpersona) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.portfolio.portfolio.Entity.EducacionPK[ idEducacion=" + idEducacion + ", personasIdpersona=" + personasIdpersona + " ]";
    }
    
}
