/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpuna.service;

import com.fpuna.entities.Collaborativefeature;
import com.fpuna.entities.Collaborativesession;
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
@Path("com.fpuna.entities.collaborativesession")
public class CollaborativesessionFacadeREST extends AbstractFacade<Collaborativesession> {

    @PersistenceContext(unitName = "ARrecolectorPU")
    private EntityManager em;

    public CollaborativesessionFacadeREST() {
        super(Collaborativesession.class);
    }

    @POST
    @Override
    @Consumes({"application/xml", "application/json"})
    public void create(Collaborativesession entity) {
        for (Collaborativefeature elem : entity.getCollaborativefeatureList()) {
            elem.setImei(entity);
        }
        super.create(entity);
    }

    @PUT
    @Path("{id}")
    @Consumes({"application/xml", "application/json"})
    public void edit(@PathParam("id") String id, Collaborativesession entity) {
        for (Collaborativefeature elem : entity.getCollaborativefeatureList()) {
            elem.setImei(entity);
        }
        super.edit(entity);
    }

    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") String id) {
        super.remove(super.find(id));
    }

    @GET
    @Path("{id}")
    @Produces({"application/xml", "application/json"})
    public Collaborativesession find(@PathParam("id") String id) {
        return super.find(id);
    }

    @GET
    @Override
    @Produces({"application/xml", "application/json"})
    public List<Collaborativesession> findAll() {
        return super.findAll();
    }

    @GET
    @Path("{from}/{to}")
    @Produces({"application/xml", "application/json"})
    public List<Collaborativesession> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
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
