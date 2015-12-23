/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpuna.service;

import java.util.Set;
import javax.ws.rs.core.Application;

/**
 *
 * @author Santirrium
 */
@javax.ws.rs.ApplicationPath("webresources")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }

    /**
     * Do not modify addRestResourceClasses() method.
     * It is automatically populated with
     * all resources defined in the project.
     * If required, comment out calling this method in getClasses().
     */
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(com.fpuna.service.CollaborativefeatureFacadeREST.class);
        resources.add(com.fpuna.service.CollaborativesessionFacadeREST.class);
        resources.add(com.fpuna.service.TrainingSetBaseFacadeREST.class);
        resources.add(com.fpuna.service.TrainingSetFeatureFacadeREST.class);
        resources.add(com.fpuna.service.TrainingSetSessionFacadeREST.class);
    }
    
}
