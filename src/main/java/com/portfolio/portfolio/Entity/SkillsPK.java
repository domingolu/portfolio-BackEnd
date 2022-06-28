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
public class SkillsPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "id_skills")
    private int idSkills;
    @Basic(optional = false)
    @NotNull
    @Column(name = "personas_idpersona")
    private int personasIdpersona;

    public SkillsPK() {
    }

    public SkillsPK(int idSkills, int personasIdpersona) {
        this.idSkills = idSkills;
        this.personasIdpersona = personasIdpersona;
    }

    public int getIdSkills() {
        return idSkills;
    }

    public void setIdSkills(int idSkills) {
        this.idSkills = idSkills;
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
        hash += (int) idSkills;
        hash += (int) personasIdpersona;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SkillsPK)) {
            return false;
        }
        SkillsPK other = (SkillsPK) object;
        if (this.idSkills != other.idSkills) {
            return false;
        }
        if (this.personasIdpersona != other.personasIdpersona) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.portfolio.portfolio.Entity.SkillsPK[ idSkills=" + idSkills + ", personasIdpersona=" + personasIdpersona + " ]";
    }
    
}
