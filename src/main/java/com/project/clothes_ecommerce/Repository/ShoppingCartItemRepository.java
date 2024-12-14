package com.project.clothes_ecommerce.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.clothes_ecommerce.Entity.ShoppingCartItem;

public interface ShoppingCartItemRepository extends JpaRepository<ShoppingCartItem, Long>{

}
