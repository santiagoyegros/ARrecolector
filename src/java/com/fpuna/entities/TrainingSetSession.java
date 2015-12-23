/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpuna.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Santirrium
 */
@Entity
@Table(name = "\"TrainingSetSession\"")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TrainingSetSession.findAll", query = "SELECT t FROM TrainingSetSession t"),
    @NamedQuery(name = "TrainingSetSession.findByIDsession", query = "SELECT t FROM TrainingSetSession t WHERE t.iDsession = :iDsession"),
    @NamedQuery(name = "TrainingSetSession.findByMail", query = "SELECT t FROM TrainingSetSession t WHERE t.mail = :mail"),
    @NamedQuery(name = "TrainingSetSession.findByFechaHora", query = "SELECT t FROM TrainingSetSession t WHERE t.fechaHora = :fechaHora"),
    @NamedQuery(name = "TrainingSetSession.findByEtiqueta", query = "SELECT t FROM TrainingSetSession t WHERE t.etiqueta = :etiqueta")})
public class TrainingSetSession implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "\"ID_session\"")
    private Integer iDsession;
    @Size(max = 100)
    @Column(name = "mail")
    private String mail;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_hora")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaHora;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "etiqueta")
    private String etiqueta;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "iDsession")
    private List<TrainingSetBase> trainingSetBaseList;

    public TrainingSetSession() {
    }

    public TrainingSetSession(Integer iDsession) {
        this.iDsession = iDsession;
    }

    public TrainingSetSession(Integer iDsession, Date fechaHora, String etiqueta) {
        this.iDsession = iDsession;
        this.fechaHora = fechaHora;
        this.etiqueta = etiqueta;
    }

    public Integer getIDsession() {
        return iDsession;
    }

    public void setIDsession(Integer iDsession) {
        this.iDsession = iDsession;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Date getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(Date fechaHora) {
        this.fechaHora = fechaHora;
    }

    public String getEtiqueta() {
        return etiqueta;
    }

    public void setEtiqueta(String etiqueta) {
        this.etiqueta = etiqueta;
    }

    public List<TrainingSetBase> getTrainingSetBaseList() {
        return trainingSetBaseList;
    }

    public void setTrainingSetBaseList(List<TrainingSetBase> trainingSetBaseList) {
        this.trainingSetBaseList = trainingSetBaseList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDsession != null ? iDsession.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TrainingSetSession)) {
            return false;
        }
        TrainingSetSession other = (TrainingSetSession) object;
        if ((this.iDsession == null && other.iDsession != null) || (this.iDsession != null && !this.iDsession.equals(other.iDsession))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.fpuna.entities.TrainingSetSession[ iDsession=" + iDsession + " ]";
    }
    
}
