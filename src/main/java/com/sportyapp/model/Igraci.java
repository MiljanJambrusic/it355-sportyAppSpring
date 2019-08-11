/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sportyapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Kevin Durant
 */
@Table(name = "igraci")
@Entity
public class Igraci {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id") 
    private int id;
    @Column(name = "igrac")
    private String igrac;
    @Column(name = "status")
    private int status;
    @Column(name = "nazivtima")
    private String nazivtima;

    public Igraci() {
    }

    public Igraci(int id, String igrac, int status, String nazivtima) {
        this.id = id;
        this.igrac = igrac;
        this.status = status;
        this.nazivtima = nazivtima;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIgrac() {
        return igrac;
    }

    public void setIgrac(String igrac) {
        this.igrac = igrac;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getNazivtima() {
        return nazivtima;
    }

    public void setNazivtima(String nazivtima) {
        this.nazivtima = nazivtima;
    }
    
    
}
