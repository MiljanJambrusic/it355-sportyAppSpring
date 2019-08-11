/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sportyapp.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

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
    @ManyToMany
    @JoinTable(name = "user_role",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles = new HashSet<>();

    
    public Korisnici() {
    }

    public Korisnici(int k_id, String ime, String prezime, String korisnickoime, String password, String email, int privilegije, String token) {
        this.k_id = k_id;
        this.ime = ime;
        this.prezime = prezime;
        this.korisnickoime = korisnickoime;
        this.password = password;
        this.email = email;
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

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }
}
