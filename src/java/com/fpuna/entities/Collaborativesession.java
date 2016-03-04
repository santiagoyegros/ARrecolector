/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpuna.entities;

import java.io.Serializable;
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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Santirrium
 */
@Entity
@Table(name = "collaborativesession")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Collaborativesession.findAll", query = "SELECT c FROM Collaborativesession c"),
    @NamedQuery(name = "Collaborativesession.findByImei", query = "SELECT c FROM Collaborativesession c WHERE c.imei = :imei"),
    @NamedQuery(name = "Collaborativesession.findByNombre", query = "SELECT c FROM Collaborativesession c WHERE c.nombre = :nombre"),
    @NamedQuery(name = "Collaborativesession.findBySensorName", query = "SELECT c FROM Collaborativesession c WHERE c.sensorName = :sensorName"),
    @NamedQuery(name = "Collaborativesession.findByPhoneName", query = "SELECT c FROM Collaborativesession c WHERE c.phoneName = :phoneName")})
public class Collaborativesession implements Serializable {
    @Size(max = 100)
    @Column(name = "mail")
    private String mail;
    @Size(max = 1)
    @Column(name = "sexo")
    private String sexo;
    @Column(name = "edad")
    private Integer edad;
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "imei")
    private String imei;
    @Size(max = 100)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "sensor_name")
    private String sensorName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "phone_name")
    private String phoneName;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "imei")
    private List<Collaborativefeature> collaborativefeatureList;

    public Collaborativesession() {
    }

    public Collaborativesession(String imei) {
        this.imei = imei;
    }

    public Collaborativesession(String imei, String sensorName, String phoneName) {
        this.imei = imei;
        this.sensorName = sensorName;
        this.phoneName = phoneName;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSensorName() {
        return sensorName;
    }

    public void setSensorName(String sensorName) {
        this.sensorName = sensorName;
    }

    public String getPhoneName() {
        return phoneName;
    }

    public void setPhoneName(String phoneName) {
        this.phoneName = phoneName;
    }

    public List<Collaborativefeature> getCollaborativefeatureList() {
        return collaborativefeatureList;
    }

    public void setCollaborativefeatureList(List<Collaborativefeature> collaborativefeatureList) {
        this.collaborativefeatureList = collaborativefeatureList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (imei != null ? imei.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Collaborativesession)) {
            return false;
        }
        Collaborativesession other = (Collaborativesession) object;
        if ((this.imei == null && other.imei != null) || (this.imei != null && !this.imei.equals(other.imei))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.fpuna.entities.Collaborativesession[ imei=" + imei + " ]";
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }
    
}
