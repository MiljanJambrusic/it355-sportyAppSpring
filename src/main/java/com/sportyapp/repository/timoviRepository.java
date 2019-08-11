/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sportyapp.repository;

import com.sportyapp.model.Timovi;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Kevin Durant
 */
@Repository
public interface timoviRepository extends JpaRepository<Timovi, Long> {
    
    @Query(value = "Select nazivtima,kreator from timovi", nativeQuery = true)
    List<Timovi> getNazivTimova();
    
    @Transactional
    @Query(value = "DELETE FROM timovi where nazivtima=?1", nativeQuery = true)
    void obrisitim(String nazivtima);
    
}
