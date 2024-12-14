package com.project.clothes_ecommerce.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.clothes_ecommerce.Entity.ShopOrder;

public interface ShopOrderRepository extends JpaRepository<ShopOrder, Long>{

}
