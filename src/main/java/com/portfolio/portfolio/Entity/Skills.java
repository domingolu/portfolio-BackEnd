/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.portfolio.Entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Domingo
 */
@Entity
@Table(name = "skills")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Skills.findAll", query = "SELECT s FROM Skills s"),
    @NamedQuery(name = "Skills.findByIdSkills", query = "SELECT s FROM Skills s WHERE s.skillsPK.idSkills = :idSkills"),
    @NamedQuery(name = "Skills.findByPersonasIdpersona", query = "SELECT s FROM Skills s WHERE s.skillsPK.personasIdpersona = :personasIdpersona"),
    @NamedQuery(name = "Skills.findBySkill", query = "SELECT s FROM Skills s WHERE s.skill = :skill"),
    @NamedQuery(name = "Skills.findByTipo", query = "SELECT s FROM Skills s WHERE s.tipo = :tipo"),
    @NamedQuery(name = "Skills.findByPorcentaje", query = "SELECT s FROM Skills s WHERE s.porcentaje = :porcentaje")})
public class Skills implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected SkillsPK skillsPK;
    @Size(max = 45)
    @Column(name = "skill")
    private String skill;
    @Size(max = 45)
    @Column(name = "tipo")
    private String tipo;
    @Column(name = "porcentaje")
    private Integer porcentaje;
    @JoinColumn(name = "personas_idpersona", referencedColumnName = "idpersona", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Personas personas;

    public Skills() {
    }

    public Skills(SkillsPK skillsPK) {
        this.skillsPK = skillsPK;
    }

    public Skills(int idSkills, int personasIdpersona) {
        this.skillsPK = new SkillsPK(idSkills, personasIdpersona);
    }

    public SkillsPK getSkillsPK() {
        return skillsPK;
    }

    public void setSkillsPK(SkillsPK skillsPK) {
        this.skillsPK = skillsPK;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(Integer porcentaje) {
        this.porcentaje = porcentaje;
    }

    public Personas getPersonas() {
        return personas;
    }

    public void setPersonas(Personas personas) {
        this.personas = personas;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (skillsPK != null ? skillsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Skills)) {
            return false;
        }
        Skills other = (Skills) object;
        if ((this.skillsPK == null && other.skillsPK != null) || (this.skillsPK != null && !this.skillsPK.equals(other.skillsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.portfolio.portfolio.Entity.Skills[ skillsPK=" + skillsPK + " ]";
    }
    
}
