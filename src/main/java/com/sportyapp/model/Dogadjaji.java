/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sportyapp.model;

import java.math.BigInteger;
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
@Table(name = "dogadjaji")
@Entity
public class Dogadjaji {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_dog") 
    private int id_dog;
    @Column(name = "tim1") 
    private String tim1;
    @Column(name = "tim2") 
    private String tim2;
    @Column(name = "mesec") 
    private String mesec;
    @Column(name = "dan") 
    private int dan;
    @Column(name = "sat") 
    private String sat;
    @Column(name = "status") 
    private int status;
    @Column(name = "kreator") 
    private String kreator;

    public Dogadjaji() {
    }

    public Dogadjaji(int id_dog, String tim1, String tim2, String mesec, int dan, String sat, int status, String kreator) {
        this.id_dog = id_dog;
        this.tim1 = tim1;
        this.tim2 = tim2;
        this.mesec = mesec;
        this.dan = dan;
        this.sat = sat;
        this.status = status;
        this.kreator = kreator;
    }

    public int getId_dog() {
        return id_dog;
    }

    public void setId_dog(int id_dog) {
        this.id_dog = id_dog;
    }

    public String getTim1() {
        return tim1;
    }

    public void setTim1(String tim1) {
        this.tim1 = tim1;
    }

    public String getTim2() {
        return tim2;
    }

    public void setTim2(String tim2) {
        this.tim2 = tim2;
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

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getKreator() {
        return kreator;
    }

    public void setKreator(String kreator) {
        this.kreator = kreator;
    }
    
    
    
}
