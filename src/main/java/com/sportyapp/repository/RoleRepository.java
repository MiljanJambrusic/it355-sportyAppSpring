package com.sportyapp.repository;

import com.sportyapp.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

    Role findByRole(String role);

    @Transactional
    @Modifying
    @Query(value = "DELETE FROM user_role WHERE user_id = ?1 AND role_id = ?2", nativeQuery = true)
    void deleteUserRole(Long user_id, Long role_id);

    @Transactional
    @Modifying
    @Query(value = "INSERT INTO user_role (user_id, role_id) VALUES (?1,?2)", nativeQuery = true)
    void addUserRole(Long user_id, Long role_id);
}