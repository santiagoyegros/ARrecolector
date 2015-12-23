/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpuna.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Santirrium
 */
@Entity
@Table(name = "\"TrainingSetBase\"")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TrainingSetBase.findAll", query = "SELECT t FROM TrainingSetBase t"),
    @NamedQuery(name = "TrainingSetBase.findByIDbase", query = "SELECT t FROM TrainingSetBase t WHERE t.iDbase = :iDbase"),
    @NamedQuery(name = "TrainingSetBase.findByValX", query = "SELECT t FROM TrainingSetBase t WHERE t.valX = :valX"),
    @NamedQuery(name = "TrainingSetBase.findByValY", query = "SELECT t FROM TrainingSetBase t WHERE t.valY = :valY"),
    @NamedQuery(name = "TrainingSetBase.findByValZ", query = "SELECT t FROM TrainingSetBase t WHERE t.valZ = :valZ"),
    @NamedQuery(name = "TrainingSetBase.findByIDsensor", query = "SELECT t FROM TrainingSetBase t WHERE t.iDsensor = :iDsensor"),
    @NamedQuery(name = "TrainingSetBase.findByDelta", query = "SELECT t FROM TrainingSetBase t WHERE t.delta = :delta"),
    @NamedQuery(name = "TrainingSetBase.findByM", query = "SELECT t FROM TrainingSetBase t WHERE t.m = :m")})
public class TrainingSetBase implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "\"ID_base\"")
    private Integer iDbase;
    @Basic(optional = false)
    @NotNull
    @Column(name = "val_x")
    private float valX;
    @Basic(optional = false)
    @NotNull
    @Column(name = "val_y")
    private float valY;
    @Basic(optional = false)
    @NotNull
    @Column(name = "val_z")
    private float valZ;
    @Basic(optional = false)
    @Column(name = "m", nullable = true)
    private Float m;
    @Basic(optional = false)
    @NotNull
    @Column(name = "\"ID_sensor\"")
    private long iDsensor;
    @Basic(optional = false)
    @NotNull
    @Column(name = "delta")
    private long delta;
    @JoinColumn(name = "`ID_session`", referencedColumnName = "`ID_session`")
    @ManyToOne(optional = false)
    private TrainingSetSession iDsession;

    public TrainingSetBase() {
    }

    public TrainingSetBase(Integer iDbase) {
        this.iDbase = iDbase;
    }

    public TrainingSetBase(Integer iDbase, float valX, float valY, float valZ,long iDsensor, long delta) {
        this.iDbase = iDbase;
        this.valX = valX;
        this.valY = valY;
        this.valZ = valZ;
        this.iDsensor = iDsensor;
        this.delta = delta;
    }

    public Integer getIDbase() {
        return iDbase;
    }

    public void setIDbase(Integer iDbase) {
        this.iDbase = iDbase;
    }

    public float getValX() {
        return valX;
    }

    public void setValX(float valX) {
        this.valX = valX;
    }

    public float getValY() {
        return valY;
    }

    public void setValY(float valY) {
        this.valY = valY;
    }

    public float getValZ() {
        return valZ;
    }

    public void setValZ(float valZ) {
        this.valZ = valZ;
    }

    public Float getM() {
        return m;
    }

    public void setM(Float m) {
        this.m = m;
    }
    
    public long getIDsensor() {
        return iDsensor;
    }

    public void setIDsensor(long iDsensor) {
        this.iDsensor = iDsensor;
    }

    public long getDelta() {
        return delta;
    }

    public void setDelta(long delta) {
        this.delta = delta;
    }

    @XmlTransient
    public TrainingSetSession getIDsession() {
        return iDsession;
    }

    public void setIDsession(TrainingSetSession iDsession) {
        this.iDsession = iDsession;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDbase != null ? iDbase.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TrainingSetBase)) {
            return false;
        }
        TrainingSetBase other = (TrainingSetBase) object;
        if ((this.iDbase == null && other.iDbase != null) || (this.iDbase != null && !this.iDbase.equals(other.iDbase))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.fpuna.entities.TrainingSetBase[ iDbase=" + iDbase + " ]";
    }
    
}
