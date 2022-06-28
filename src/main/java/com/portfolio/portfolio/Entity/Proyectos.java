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
@Table(name = "proyectos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Proyectos.findAll", query = "SELECT p FROM Proyectos p"),
    @NamedQuery(name = "Proyectos.findByIdProyecto", query = "SELECT p FROM Proyectos p WHERE p.proyectosPK.idProyecto = :idProyecto"),
    @NamedQuery(name = "Proyectos.findByPersonasIdpersona", query = "SELECT p FROM Proyectos p WHERE p.proyectosPK.personasIdpersona = :personasIdpersona"),
    @NamedQuery(name = "Proyectos.findByProyecto", query = "SELECT p FROM Proyectos p WHERE p.proyecto = :proyecto"),
    @NamedQuery(name = "Proyectos.findByDuraci\u00f3n", query = "SELECT p FROM Proyectos p WHERE p.duraci\u00f3n = :duraci\u00f3n"),
    @NamedQuery(name = "Proyectos.findByDescripcion", query = "SELECT p FROM Proyectos p WHERE p.descripcion = :descripcion"),
    @NamedQuery(name = "Proyectos.findByImagen", query = "SELECT p FROM Proyectos p WHERE p.imagen = :imagen")})
public class Proyectos implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ProyectosPK proyectosPK;
    @Size(max = 45)
    @Column(name = "proyecto")
    private String proyecto;
    @Size(max = 45)
    @Column(name = "duraci\u00f3n")
    private String duración;
    @Size(max = 100)
    @Column(name = "descripcion")
    private String descripcion;
    @Size(max = 250)
    @Column(name = "imagen")
    private String imagen;
    @JoinColumn(name = "personas_idpersona", referencedColumnName = "idpersona", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Personas personas;

    public Proyectos() {
    }

    public Proyectos(ProyectosPK proyectosPK) {
        this.proyectosPK = proyectosPK;
    }

    public Proyectos(int idProyecto, int personasIdpersona) {
        this.proyectosPK = new ProyectosPK(idProyecto, personasIdpersona);
    }

    public ProyectosPK getProyectosPK() {
        return proyectosPK;
    }

    public void setProyectosPK(ProyectosPK proyectosPK) {
        this.proyectosPK = proyectosPK;
    }

    public String getProyecto() {
        return proyecto;
    }

    public void setProyecto(String proyecto) {
        this.proyecto = proyecto;
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
        hash += (proyectosPK != null ? proyectosPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Proyectos)) {
            return false;
        }
        Proyectos other = (Proyectos) object;
        if ((this.proyectosPK == null && other.proyectosPK != null) || (this.proyectosPK != null && !this.proyectosPK.equals(other.proyectosPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.portfolio.portfolio.Entity.Proyectos[ proyectosPK=" + proyectosPK + " ]";
    }
    
}
