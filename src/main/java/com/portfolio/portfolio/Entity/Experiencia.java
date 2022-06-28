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
@Table(name = "experiencia")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Experiencia.findAll", query = "SELECT e FROM Experiencia e"),
    @NamedQuery(name = "Experiencia.findByIdExperiencia", query = "SELECT e FROM Experiencia e WHERE e.experienciaPK.idExperiencia = :idExperiencia"),
    @NamedQuery(name = "Experiencia.findByPersonasIdpersona", query = "SELECT e FROM Experiencia e WHERE e.experienciaPK.personasIdpersona = :personasIdpersona"),
    @NamedQuery(name = "Experiencia.findByTrabajo", query = "SELECT e FROM Experiencia e WHERE e.trabajo = :trabajo"),
    @NamedQuery(name = "Experiencia.findByDuraci\u00f3n", query = "SELECT e FROM Experiencia e WHERE e.duraci\u00f3n = :duraci\u00f3n"),
    @NamedQuery(name = "Experiencia.findByDescripcion", query = "SELECT e FROM Experiencia e WHERE e.descripcion = :descripcion"),
    @NamedQuery(name = "Experiencia.findByImagen", query = "SELECT e FROM Experiencia e WHERE e.imagen = :imagen")})
public class Experiencia implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ExperienciaPK experienciaPK;
    @Size(max = 45)
    @Column(name = "trabajo")
    private String trabajo;
    @Size(max = 45)
    @Column(name = "duraci\u00f3n")
    private String duración;
    @Size(max = 200)
    @Column(name = "descripcion")
    private String descripcion;
    @Size(max = 250)
    @Column(name = "imagen")
    private String imagen;
    @JoinColumn(name = "personas_idpersona", referencedColumnName = "idpersona", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Personas personas;

    public Experiencia() {
    }

    public Experiencia(ExperienciaPK experienciaPK) {
        this.experienciaPK = experienciaPK;
    }

    public Experiencia(int idExperiencia, int personasIdpersona) {
        this.experienciaPK = new ExperienciaPK(idExperiencia, personasIdpersona);
    }

    public ExperienciaPK getExperienciaPK() {
        return experienciaPK;
    }

    public void setExperienciaPK(ExperienciaPK experienciaPK) {
        this.experienciaPK = experienciaPK;
    }

    public String getTrabajo() {
        return trabajo;
    }

    public void setTrabajo(String trabajo) {
        this.trabajo = trabajo;
    }

    public String getDuración() {
        return duración;
    }

    public void setDuración(String duración) {
        this.duración = duración;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
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
        hash += (experienciaPK != null ? experienciaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Experiencia)) {
            return false;
        }
        Experiencia other = (Experiencia) object;
        if ((this.experienciaPK == null && other.experienciaPK != null) || (this.experienciaPK != null && !this.experienciaPK.equals(other.experienciaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.portfolio.portfolio.Entity.Experiencia[ experienciaPK=" + experienciaPK + " ]";
    }
    
}
