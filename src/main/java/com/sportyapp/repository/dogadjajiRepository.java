/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sportyapp.repository;

import com.sportyapp.model.Dogadjaji;
import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Kevin Durant
 */
@Repository
public interface dogadjajiRepository extends JpaRepository<Dogadjaji, Long> {
    
    @Modifying
    @Transactional
    @Query(value = "UPDATE dogadjaji SET status=1 WHERE id_dog=?1", nativeQuery = true)
    void updateStatusDogadjaja(int id_dog);
    
    @Modifying
    @Transactional
    @Query(value = "UPDATE dogadjaji SET tim2=?1 WHERE id_dog=?2", nativeQuery = true)
    void updateTim2Dogadjaj(String tim2,int id_dog);
    
}
