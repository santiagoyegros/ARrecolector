/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpuna.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
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
@Table(name = "collaborativefeature")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Collaborativefeature.findAll", query = "SELECT c FROM Collaborativefeature c"),
    @NamedQuery(name = "Collaborativefeature.findByIdCf", query = "SELECT c FROM Collaborativefeature c WHERE c.idCf = :idCf"),
    @NamedQuery(name = "Collaborativefeature.findByEtiqueta", query = "SELECT c FROM Collaborativefeature c WHERE c.etiqueta = :etiqueta"),
    @NamedQuery(name = "Collaborativefeature.findByMeanX", query = "SELECT c FROM Collaborativefeature c WHERE c.meanX = :meanX"),
    @NamedQuery(name = "Collaborativefeature.findByStdX", query = "SELECT c FROM Collaborativefeature c WHERE c.stdX = :stdX"),
    @NamedQuery(name = "Collaborativefeature.findByMaxX", query = "SELECT c FROM Collaborativefeature c WHERE c.maxX = :maxX"),
    @NamedQuery(name = "Collaborativefeature.findByMinX", query = "SELECT c FROM Collaborativefeature c WHERE c.minX = :minX"),
    @NamedQuery(name = "Collaborativefeature.findBySkewnessX", query = "SELECT c FROM Collaborativefeature c WHERE c.skewnessX = :skewnessX"),
    @NamedQuery(name = "Collaborativefeature.findByKurtosisX", query = "SELECT c FROM Collaborativefeature c WHERE c.kurtosisX = :kurtosisX"),
    @NamedQuery(name = "Collaborativefeature.findByEnergyX", query = "SELECT c FROM Collaborativefeature c WHERE c.energyX = :energyX"),
    @NamedQuery(name = "Collaborativefeature.findByEntropyX", query = "SELECT c FROM Collaborativefeature c WHERE c.entropyX = :entropyX"),
    @NamedQuery(name = "Collaborativefeature.findByIqrX", query = "SELECT c FROM Collaborativefeature c WHERE c.iqrX = :iqrX"),
    @NamedQuery(name = "Collaborativefeature.findByArX1", query = "SELECT c FROM Collaborativefeature c WHERE c.arX1 = :arX1"),
    @NamedQuery(name = "Collaborativefeature.findByArX2", query = "SELECT c FROM Collaborativefeature c WHERE c.arX2 = :arX2"),
    @NamedQuery(name = "Collaborativefeature.findByArX3", query = "SELECT c FROM Collaborativefeature c WHERE c.arX3 = :arX3"),
    @NamedQuery(name = "Collaborativefeature.findByArX4", query = "SELECT c FROM Collaborativefeature c WHERE c.arX4 = :arX4"),
    @NamedQuery(name = "Collaborativefeature.findByMeanfreqX", query = "SELECT c FROM Collaborativefeature c WHERE c.meanfreqX = :meanfreqX"),
    @NamedQuery(name = "Collaborativefeature.findByFecha", query = "SELECT c FROM Collaborativefeature c WHERE c.fecha = :fecha")})
public class Collaborativefeature implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_cf")
    private Long idCf;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "etiqueta")
    private String etiqueta;
    @Basic(optional = false)
    @NotNull
    @Column(name = "mean_x")
    private float meanX;
    @Basic(optional = false)
    @NotNull
    @Column(name = "std_x")
    private float stdX;
    @Basic(optional = false)
    @NotNull
    @Column(name = "max_x")
    private float maxX;
    @Basic(optional = false)
    @NotNull
    @Column(name = "min_x")
    private float minX;
    @Basic(optional = false)
    @NotNull
    @Column(name = "skewness_x")
    private float skewnessX;
    @Basic(optional = false)
    @NotNull
    @Column(name = "kurtosis_x")
    private float kurtosisX;
    @Basic(optional = false)
    @NotNull
    @Column(name = "energy_x")
    private float energyX;
    @Basic(optional = false)
    @NotNull
    @Column(name = "entropy_x")
    private float entropyX;
    @Basic(optional = false)
    @NotNull
    @Column(name = "iqr_x")
    private float iqrX;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ar_x_1")
    private float arX1;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ar_x_2")
    private float arX2;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ar_x_3")
    private float arX3;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ar_x_4")
    private float arX4;
    @Basic(optional = false)
    @NotNull
    @Column(name = "meanfreq_x")
    private float meanfreqX;
    @Column(name = "fecha")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @JoinColumn(name = "imei", referencedColumnName = "imei")
    @ManyToOne(optional = false)
    private Collaborativesession imei;

    public Collaborativefeature() {
    }

    public Collaborativefeature(Long idCf) {
        this.idCf = idCf;
    }

    public Collaborativefeature(Long idCf, String etiqueta, float meanX, float stdX, float maxX, float minX, float skewnessX, float kurtosisX, float energyX, float entropyX, float iqrX, float arX1, float arX2, float arX3, float arX4, float meanfreqX) {
        this.idCf = idCf;
        this.etiqueta = etiqueta;
        this.meanX = meanX;
        this.stdX = stdX;
        this.maxX = maxX;
        this.minX = minX;
        this.skewnessX = skewnessX;
        this.kurtosisX = kurtosisX;
        this.energyX = energyX;
        this.entropyX = entropyX;
        this.iqrX = iqrX;
        this.arX1 = arX1;
        this.arX2 = arX2;
        this.arX3 = arX3;
        this.arX4 = arX4;
        this.meanfreqX = meanfreqX;
    }

    public Long getIdCf() {
        return idCf;
    }

    public void setIdCf(Long idCf) {
        this.idCf = idCf;
    }

    public String getEtiqueta() {
        return etiqueta;
    }

    public void setEtiqueta(String etiqueta) {
        this.etiqueta = etiqueta;
    }

    public float getMeanX() {
        return meanX;
    }

    public void setMeanX(float meanX) {
        this.meanX = meanX;
    }

    public float getStdX() {
        return stdX;
    }

    public void setStdX(float stdX) {
        this.stdX = stdX;
    }

    public float getMaxX() {
        return maxX;
    }

    public void setMaxX(float maxX) {
        this.maxX = maxX;
    }

    public float getMinX() {
        return minX;
    }

    public void setMinX(float minX) {
        this.minX = minX;
    }

    public float getSkewnessX() {
        return skewnessX;
    }

    public void setSkewnessX(float skewnessX) {
        this.skewnessX = skewnessX;
    }

    public float getKurtosisX() {
        return kurtosisX;
    }

    public void setKurtosisX(float kurtosisX) {
        this.kurtosisX = kurtosisX;
    }

    public float getEnergyX() {
        return energyX;
    }

    public void setEnergyX(float energyX) {
        this.energyX = energyX;
    }

    public float getEntropyX() {
        return entropyX;
    }

    public void setEntropyX(float entropyX) {
        this.entropyX = entropyX;
    }

    public float getIqrX() {
        return iqrX;
    }

    public void setIqrX(float iqrX) {
        this.iqrX = iqrX;
    }

    public float getArX1() {
        return arX1;
    }

    public void setArX1(float arX1) {
        this.arX1 = arX1;
    }

    public float getArX2() {
        return arX2;
    }

    public void setArX2(float arX2) {
        this.arX2 = arX2;
    }

    public float getArX3() {
        return arX3;
    }

    public void setArX3(float arX3) {
        this.arX3 = arX3;
    }

    public float getArX4() {
        return arX4;
    }

    public void setArX4(float arX4) {
        this.arX4 = arX4;
    }

    public float getMeanfreqX() {
        return meanfreqX;
    }

    public void setMeanfreqX(float meanfreqX) {
        this.meanfreqX = meanfreqX;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @XmlTransient
    public Collaborativesession getImei() {
        return imei;
    }

    public void setImei(Collaborativesession imei) {
        this.imei = imei;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCf != null ? idCf.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Collaborativefeature)) {
            return false;
        }
        Collaborativefeature other = (Collaborativefeature) object;
        if ((this.idCf == null && other.idCf != null) || (this.idCf != null && !this.idCf.equals(other.idCf))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.fpuna.entities.Collaborativefeature[ idCf=" + idCf + " ]";
    }
    
}
