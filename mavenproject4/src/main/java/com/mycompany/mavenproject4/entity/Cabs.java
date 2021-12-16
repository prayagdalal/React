/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject4.entity;

import java.io.Serializable;
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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author abhishek jariwala
 */
@Entity
@Table(name = "cabs")
@NamedQueries({
    @NamedQuery(name = "Cabs.findAll", query = "SELECT c FROM Cabs c"),
    @NamedQuery(name = "Cabs.findById", query = "SELECT c FROM Cabs c WHERE c.id = :id"),
    @NamedQuery(name = "Cabs.findByCompany", query = "SELECT c FROM Cabs c WHERE c.company = :company"),
    @NamedQuery(name = "Cabs.findByModel", query = "SELECT c FROM Cabs c WHERE c.model = :model"),
    @NamedQuery(name = "Cabs.findByStatus", query = "SELECT c FROM Cabs c WHERE c.status = :status"),
    @NamedQuery(name = "Cabs.findByDrivername", query = "SELECT c FROM Cabs c WHERE c.drivername = :drivername"),
    @NamedQuery(name = "Cabs.findByPhoneno", query = "SELECT c FROM Cabs c WHERE c.phoneno = :phoneno")})
public class Cabs implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "company")
    private String company;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "model")
    private String model;
    @Basic(optional = false)
    @NotNull
    @Column(name = "status")
    private int status;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "drivername")
    private String drivername;
    @Basic(optional = false)
    @NotNull
    @Column(name = "phoneno")
    private int phoneno;
    @JoinColumn(name = "size", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private CabSize size1;

    public Cabs() {
    }

    public Cabs(Integer id) {
        this.id = id;
    }

    public Cabs(Integer id, String company, String model, int status, String drivername, int phoneno) {
        this.id = id;
        this.company = company;
        this.model = model;
        this.status = status;
        this.drivername = drivername;
        this.phoneno = phoneno;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getDrivername() {
        return drivername;
    }

    public void setDrivername(String drivername) {
        this.drivername = drivername;
    }

    public int getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(int phoneno) {
        this.phoneno = phoneno;
    }

    public CabSize getSize1() {
        return size1;
    }

    public void setSize1(CabSize size1) {
        this.size1 = size1;
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
        if (!(object instanceof Cabs)) {
            return false;
        }
        Cabs other = (Cabs) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.mavenproject4.entity.Cabs[ id=" + id + " ]";
    }
    
}
