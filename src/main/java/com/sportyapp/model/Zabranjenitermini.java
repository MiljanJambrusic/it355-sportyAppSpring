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
@Table(name = "zabranjenitermini")
@Entity
public class Zabranjenitermini {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "zabr_id") 
    private int zabr_id;
    
    @Column(name = "sport")
    private String sport;
    @Column(name = "mesec")
    private String mesec;
    @Column(name = "dan")
    private int dan;
    @Column(name = "sat")
    private String sat;

    public Zabranjenitermini() {
    }

    public Zabranjenitermini(int zabr_id, String sport, String mesec, int dan, String sat) {
        this.zabr_id = zabr_id;
        this.sport = sport;
        this.mesec = mesec;
        this.dan = dan;
        this.sat = sat;
    }

    public int getZabr_id() {
        return zabr_id;
    }

    public void setZabr_id(int zabr_id) {
        this.zabr_id = zabr_id;
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public String getMesec() {
        return mesec;
    }

    public void setMesec(String mesec) {
        this.mesec = mesec;
    }

    public int getDan() {
        return dan;
    }

    public void setDan(int dan) {
        this.dan = dan;
    }

    public String getSat() {
        return sat;
    }

    public void setSat(String sat) {
        this.sat = sat;
    }
    
    
}
