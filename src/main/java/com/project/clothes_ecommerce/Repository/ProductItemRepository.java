package com.project.clothes_ecommerce.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.clothes_ecommerce.Entity.ProductItem;

public interface ProductItemRepository extends JpaRepository<ProductItem, Long>{

}
