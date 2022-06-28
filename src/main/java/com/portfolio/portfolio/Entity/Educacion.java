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
@Table(name = "educacion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Educacion.findAll", query = "SELECT e FROM Educacion e"),
    @NamedQuery(name = "Educacion.findByIdEducacion", query = "SELECT e FROM Educacion e WHERE e.educacionPK.idEducacion = :idEducacion"),
    @NamedQuery(name = "Educacion.findByPersonasIdpersona", query = "SELECT e FROM Educacion e WHERE e.educacionPK.personasIdpersona = :personasIdpersona"),
    @NamedQuery(name = "Educacion.findByEducacion", query = "SELECT e FROM Educacion e WHERE e.educacion = :educacion"),
    @NamedQuery(name = "Educacion.findByDuraci\u00f3n", query = "SELECT e FROM Educacion e WHERE e.duraci\u00f3n = :duraci\u00f3n"),
    @NamedQuery(name = "Educacion.findByDescripcion", query = "SELECT e FROM Educacion e WHERE e.descripcion = :descripcion"),
    @NamedQuery(name = "Educacion.findByImagen", query = "SELECT e FROM Educacion e WHERE e.imagen = :imagen")})
public class Educacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected EducacionPK educacionPK;
    @Size(max = 100)
    @Column(name = "educacion")
    private String educacion;
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

    public Educacion() {
    }

    public Educacion(EducacionPK educacionPK) {
        this.educacionPK = educacionPK;
    }

    public Educacion(int idEducacion, int personasIdpersona) {
        this.educacionPK = new EducacionPK(idEducacion, personasIdpersona);
    }

    public EducacionPK getEducacionPK() {
        return educacionPK;
    }

    public void setEducacionPK(EducacionPK educacionPK) {
        this.educacionPK = educacionPK;
    }

    public String getEducacion() {
        return educacion;
    }

    public void setEducacion(String educacion) {
        this.educacion = educacion;
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
        hash += (educacionPK != null ? educacionPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Educacion)) {
            return false;
        }
        Educacion other = (Educacion) object;
        if ((this.educacionPK == null && other.educacionPK != null) || (this.educacionPK != null && !this.educacionPK.equals(other.educacionPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.portfolio.portfolio.Entity.Educacion[ educacionPK=" + educacionPK + " ]";
    }
    
}
