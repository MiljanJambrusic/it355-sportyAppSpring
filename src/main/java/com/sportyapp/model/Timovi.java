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
@Table(name = "timovi")
@Entity
public class Timovi {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tima") 
    private int id_tima;
    
    @Column(name = "nazivtima")
    private String nazivtima;
    @Column(name = "kreator")
    private String kreator;

    public Timovi() {
    }

    public Timovi(int id_tima, String nazivtima, String kreator) {
        this.id_tima = id_tima;
        this.nazivtima = nazivtima;
        this.kreator = kreator;
    }

    public int getId_tima() {
        return id_tima;
    }

    public void setId_tima(int id_tima) {
        this.id_tima = id_tima;
    }

    public String getNazivtima() {
        return nazivtima;
    }

    public void setNazivtima(String nazivtima) {
        this.nazivtima = nazivtima;
    }

    public String getKreator() {
        return kreator;
    }

    public void setKreator(String kreator) {
        this.kreator = kreator;
    }
    
    
}
