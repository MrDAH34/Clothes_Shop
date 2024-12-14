package com.project.clothes_ecommerce.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.clothes_ecommerce.Entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
