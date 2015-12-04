/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpuna.preproceso;

import java.sql.Timestamp;

/**
 *
 * @author Santirrium
 */
public class Registro {
    
    private Timestamp tiempo;
    private String sensor;
    private double valor_x;
    private double valor_y;
    private double valor_z;
    private double m_1;
    private double m_2;

    public Registro() {
    }
    
    public Registro(Timestamp tiempo, double valor_x, double valor_y, double valor_z) {
        this.tiempo = tiempo;
        this.valor_x = valor_x;
        this.valor_y = valor_y;
        this.valor_z = valor_z;
    }

    public Registro(Timestamp tiempo, double valor_x, double valor_y, double valor_z, double m_1, double m_2) {
        this.tiempo = tiempo;
        this.valor_x = valor_x;
        this.valor_y = valor_y;
        this.valor_z = valor_z;
        this.m_1 = m_1;
        this.m_2 = m_2;
    }

    public Timestamp getTiempo() {
        return tiempo;
    }

    public void setTiempo(Timestamp tiempo) {
        this.tiempo = tiempo;
    }

    public double getValor_x() {
        return valor_x;
    }

    public void setValor_x(double valor_x) {
        this.valor_x = valor_x;
    }

    public double getValor_y() {
        return valor_y;
    }

    public void setValor_y(double valor_y) {
        this.valor_y = valor_y;
    }

    public double getValor_z() {
        return valor_z;
    }

    public void setValor_z(double valor_z) {
        this.valor_z = valor_z;
    }

    public double getM_1() {
        return m_1;
    }

    public void setM_1(double m_1) {
        this.m_1 = m_1;
    }

    public double getM_2() {
        return m_2;
    }

    public void setM_2(double m_2) {
        this.m_2 = m_2;
    }

    public String getSensor() {
        return sensor;
    }

    public void setSensor(String sensor) {
        this.sensor = sensor;
    }
    
    
    
}
