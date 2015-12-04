/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpuna.preproceso;

/**
 *
 * @author Santirrium
 */
public class SessionTS {
    private String actividad;
    private Registro[] registros;

    public SessionTS() {
    }

    public SessionTS(String actividad, Registro[] registros) {
        this.actividad = actividad;
        this.registros = registros;
    }

    public String getActividad() {
        return actividad;
    }

    public void setActividad(String actividad) {
        this.actividad = actividad;
    }

    public Registro[] getRegistros() {
        return registros;
    }

    public void setRegistros(Registro[] registros) {
        this.registros = registros;
    }
    
    public void addRegistro(Registro registro){
        Registro[] nuevos;
        
        if(this.registros == null){
            nuevos = new Registro[1];
            nuevos[0] = registro;
        }else {
            nuevos = new Registro[this.registros.length+1];
            System.arraycopy(this.registros, 0, nuevos, 0, this.registros.length);
            nuevos[this.registros.length] = registro;
        }
        
        this.setRegistros(nuevos);
    }
   
}
