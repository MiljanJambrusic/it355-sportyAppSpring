/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sportyapp.repository;

import com.sportyapp.model.Igraci;
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
public interface igraciRepository extends JpaRepository<Igraci, Long>{
    
    @Transactional
    @Query(value = "DELETE FROM igraci where nazivtima=?1", nativeQuery = true)
    void obrisitimizlisteigraca(String nazivtima);
    
    @Modifying
    @Transactional
    @Query(value = "UPDATE dogadjaji SET status=1 WHERE id_dog=?1", nativeQuery = true)
    void updateStatusIgracaUTim(int id_dog);
    
    
}
