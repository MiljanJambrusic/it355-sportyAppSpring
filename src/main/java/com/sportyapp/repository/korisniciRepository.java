/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sportyapp.repository;
import com.sportyapp.model.Korisnici;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.Optional;

/**
 *
 * @author Kevin Durant
 */
@Repository
public interface korisniciRepository extends JpaRepository<Korisnici, Long>{

    Optional<Korisnici> findBykorisnickoime(String username);
    Boolean existsByKorisnickoime(String username);
    Boolean existsByEmail(String email);

    @Query(value = "update korisnici set token = ?2 where k_id=?1",nativeQuery = true)
    @Modifying
    @Transactional
    void setToken(int id, String token);
}
