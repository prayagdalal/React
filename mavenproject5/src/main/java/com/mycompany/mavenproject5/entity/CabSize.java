/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject5.entity;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author abhishek jariwala
 */
@Entity
@Table(name = "cab_size")
@NamedQueries({
    @NamedQuery(name = "CabSize.findAll", query = "SELECT c FROM CabSize c"),
    @NamedQuery(name = "CabSize.findById", query = "SELECT c FROM CabSize c WHERE c.id = :id"),
    @NamedQuery(name = "CabSize.findBySize", query = "SELECT c FROM CabSize c WHERE c.size = :size")})
public class CabSize implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "size")
    private String size;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "size1")
    private Collection<Cabs> cabsCollection;

    public CabSize() {
    }

    public CabSize(Integer id) {
        this.id = id;
    }

    public CabSize(Integer id, String size) {
        this.id = id;
        this.size = size;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Collection<Cabs> getCabsCollection() {
        return cabsCollection;
    }

    public void setCabsCollection(Collection<Cabs> cabsCollection) {
        this.cabsCollection = cabsCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CabSize)) {
            return false;
        }
        CabSize other = (CabSize) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.mavenproject5.entity.CabSize[ id=" + id + " ]";
    }
    
}
