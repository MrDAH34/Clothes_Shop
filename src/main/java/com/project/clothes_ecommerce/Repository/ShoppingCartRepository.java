package com.project.clothes_ecommerce.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.clothes_ecommerce.Entity.ShoppingCart;

public interface ShoppingCartRepository extends JpaRepository<ShoppingCart, Long>{

}
