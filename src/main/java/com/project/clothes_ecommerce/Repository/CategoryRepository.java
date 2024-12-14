package com.project.clothes_ecommerce.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.clothes_ecommerce.Entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
