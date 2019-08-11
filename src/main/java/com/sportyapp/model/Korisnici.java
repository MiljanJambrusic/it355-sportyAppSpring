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
@Table(name = "korisnici")
@Entity
public class Korisnici {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "k_id") 
    private int k_id;
    
    @Column(name = "ime")
    private String ime;
    @Column(name = "prezime")
    private String prezime;
    @Column(name = "korisnickoime")
    private String korisnickoime;
    @Column(name = "password")
    private String password;
    @Column(name = "email")
    private String email;
    @Column(name = "privilegije")
    private int privilegije;
    @Column(name = "token")
    private String token;

    
    public Korisnici() {
    }

    public Korisnici(int k_id, String ime, String prezime, String korisnickoime, String password, String email, int privilegije, String token) {
        this.k_id = k_id;
        this.ime = ime;
        this.prezime = prezime;
        this.korisnickoime = korisnickoime;
        this.password = password;
        this.email = email;
        this.privilegije = privilegije;
        this.token = token;
    }

    public int getK_id() {
        return k_id;
    }

    public void setK_id(int k_id) {
        this.k_id = k_id;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getKorisnickoime() {
        return korisnickoime;
    }

    public void setKorisnickoime(String korisnickoime) {
        this.korisnickoime = korisnickoime;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPrivilegije() {
        return privilegije;
    }

    public void setPrivilegije(int privilegije) {
        this.privilegije = privilegije;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
    
    
    
    
}
