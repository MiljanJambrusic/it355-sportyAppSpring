/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sportyapp.repository;

import com.sportyapp.model.Igraci;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Kevin Durant
 */
public interface igraciRepository extends JpaRepository<Igraci, Long>{
    
}
