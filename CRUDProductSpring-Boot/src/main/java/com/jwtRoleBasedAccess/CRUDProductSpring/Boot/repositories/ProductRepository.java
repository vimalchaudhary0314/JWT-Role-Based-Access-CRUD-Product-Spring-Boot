package com.jwtRoleBasedAccess.CRUDProductSpring.Boot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jwtRoleBasedAccess.CRUDProductSpring.Boot.entity.Product;

public interface ProductRepository extends JpaRepository<Product,Long>{
    
}
