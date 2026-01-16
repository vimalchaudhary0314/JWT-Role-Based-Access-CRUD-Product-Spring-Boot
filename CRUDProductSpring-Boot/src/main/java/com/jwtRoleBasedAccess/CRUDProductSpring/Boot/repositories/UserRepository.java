package com.jwtRoleBasedAccess.CRUDProductSpring.Boot.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jwtRoleBasedAccess.CRUDProductSpring.Boot.entity.User;

public interface UserRepository extends JpaRepository<User,Long> {
    Optional<User> findByUsername(String username);
}    
