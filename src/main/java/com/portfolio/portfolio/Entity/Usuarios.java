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
@Table(name = "usuarios")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Usuarios.findAll", query = "SELECT u FROM Usuarios u"),
    @NamedQuery(name = "Usuarios.findByPersonasIdpersona", query = "SELECT u FROM Usuarios u WHERE u.personasIdpersona = :personasIdpersona"),
    @NamedQuery(name = "Usuarios.findByUsername", query = "SELECT u FROM Usuarios u WHERE u.username = :username"),
    @NamedQuery(name = "Usuarios.findByPassword", query = "SELECT u FROM Usuarios u WHERE u.password = :password")})
public class Usuarios implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "personas_idpersona")
    private Integer personasIdpersona;
    @Size(max = 45)
    @Column(name = "username")
    private String username;
    @Size(max = 45)
    @Column(name = "password")
    private String password;
    @JoinColumn(name = "personas_idpersona", referencedColumnName = "idpersona", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Personas personas;

    public Usuarios() {
    }

    public Usuarios(Integer personasIdpersona) {
        this.personasIdpersona = personasIdpersona;
    }

    public Integer getPersonasIdpersona() {
        return personasIdpersona;
    }

    public void setPersonasIdpersona(Integer personasIdpersona) {
        this.personasIdpersona = personasIdpersona;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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
        if (!(object instanceof Usuarios)) {
            return false;
        }
        Usuarios other = (Usuarios) object;
        if ((this.personasIdpersona == null && other.personasIdpersona != null) || (this.personasIdpersona != null && !this.personasIdpersona.equals(other.personasIdpersona))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.portfolio.portfolio.Entity.Usuarios[ personasIdpersona=" + personasIdpersona + " ]";
    }
    
}
