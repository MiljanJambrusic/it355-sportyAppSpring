/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sportyapp.repository;


import com.sportyapp.model.Zabranjenitermini;
import com.sportyapp.model.Korisnici;
import com.sportyapp.model.Zabranjenitermini;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Kevin Durant
 */
@Repository
public interface zabranjeniTerminiRepository extends JpaRepository<Zabranjenitermini, Long>{
    
    @Query(value = "SELECT sport,mesec,dan,sat FROM zabranjenitermini", nativeQuery = true)
    List<Zabranjenitermini> getZabrTermini();
}
