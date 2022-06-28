/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.portfolio.Entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Domingo
 */
@Entity
@Table(name = "social")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Social.findAll", query = "SELECT s FROM Social s"),
    @NamedQuery(name = "Social.findByPersonasIdpersona", query = "SELECT s FROM Social s WHERE s.personasIdpersona = :personasIdpersona"),
    @NamedQuery(name = "Social.findByGithub", query = "SELECT s FROM Social s WHERE s.github = :github"),
    @NamedQuery(name = "Social.findByWhatsapp", query = "SELECT s FROM Social s WHERE s.whatsapp = :whatsapp"),
    @NamedQuery(name = "Social.findByLinkedin", query = "SELECT s FROM Social s WHERE s.linkedin = :linkedin")})
public class Social implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "personas_idpersona")
    private Integer personasIdpersona;
    @Size(max = 45)
    @Column(name = "github")
    private String github;
    @Size(max = 45)
    @Column(name = "whatsapp")
    private String whatsapp;
    @Size(max = 45)
    @Column(name = "linkedin")
    private String linkedin;
    @JoinColumn(name = "personas_idpersona", referencedColumnName = "idpersona", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Personas personas;

    public Social() {
    }

    public Social(Integer personasIdpersona) {
        this.personasIdpersona = personasIdpersona;
    }

    public Integer getPersonasIdpersona() {
        return personasIdpersona;
    }

    public void setPersonasIdpersona(Integer personasIdpersona) {
        this.personasIdpersona = personasIdpersona;
    }

    public String getGithub() {
        return github;
    }

    public void setGithub(String github) {
        this.github = github;
    }

    public String getWhatsapp() {
        return whatsapp;
    }

    public void setWhatsapp(String whatsapp) {
        this.whatsapp = whatsapp;
    }

    public String getLinkedin() {
        return linkedin;
    }

    public void setLinkedin(String linkedin) {
        this.linkedin = linkedin;
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
        hash += (personasIdpersona != null ? personasIdpersona.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Social)) {
            return false;
        }
        Social other = (Social) object;
        if ((this.personasIdpersona == null && other.personasIdpersona != null) || (this.personasIdpersona != null && !this.personasIdpersona.equals(other.personasIdpersona))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.portfolio.portfolio.Entity.Social[ personasIdpersona=" + personasIdpersona + " ]";
    }
    
}
