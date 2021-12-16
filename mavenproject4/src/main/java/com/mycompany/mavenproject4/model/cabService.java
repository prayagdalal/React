/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject4.model;

import com.mycompany.mavenproject4.entity.CabSize;
import java.util.Collection;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

/**
 *
 * @author abhishek jariwala
 */
@Named
@ApplicationScoped
public class cabService {
    
    EntityManager em;

    Collection<CabSize> cb;
    
    public cabService(){
        em = Persistence.createEntityManagerFactory("com.mycompany_mavenproject4_war_1.0-SNAPSHOTPU").createEntityManager();
    }
    
    public EntityManager getEm() {
        return em;
    }

    public void setEm(EntityManager em) {
        this.em = em;
    }
    
    
    public Collection<CabSize> getAllcabs(){
        return em.createNamedQuery("CabSize.findAll").getResultList();
    }
    
 
    
    
    
}
