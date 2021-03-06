/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpuna.service;

import com.fpuna.entities.TrainingSetFeature;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

/**
 *
 * @author Santirrium
 */
@Stateless
@Path("com.fpuna.entities.TrainingSetFeature")
public class TrainingSetFeatureFacadeREST extends AbstractFacade<TrainingSetFeature> {
    @PersistenceContext(unitName = "ARrecolectorPU")
    private EntityManager em;

    public TrainingSetFeatureFacadeREST() {
        super(TrainingSetFeature.class);
    }

    @POST
    @Override
    @Consumes({"application/xml", "application/json"})
    public void create(TrainingSetFeature entity) {
        super.create(entity);
    }
    
//    @POST
//    @Path("lista")
//    @Consumes({"application/xml", "application/json"})
//    public void create(List<TrainingSetFeature> entities) {
//        for (TrainingSetFeature entity : entities) {
//            getEntityManager().persist(entity);
//        }
//    }
    
    @PUT
    @Path("{id}")
    @Consumes({"application/xml", "application/json"})
    public void edit(@PathParam("id") Long id, TrainingSetFeature entity) {
        super.edit(entity);
    }

    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") Long id) {
        super.remove(super.find(id));
    }

    @GET
    @Path("{id}")
    @Produces({"application/xml", "application/json"})
    public TrainingSetFeature find(@PathParam("id") Long id) {
        return super.find(id);
    }

    @GET
    @Override
    @Produces({"application/xml", "application/json"})
    public List<TrainingSetFeature> findAll() {
        return super.findAll();
    }

    @GET
    @Path("{from}/{to}")
    @Produces({"application/xml", "application/json"})
    public List<TrainingSetFeature> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
        return super.findRange(new int[]{from, to});
    }

    @GET
    @Path("count")
    @Produces("text/plain")
    public String countREST() {
        return String.valueOf(super.count());
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
}
