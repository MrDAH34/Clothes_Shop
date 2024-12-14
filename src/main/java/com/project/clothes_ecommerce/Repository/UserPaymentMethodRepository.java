package com.project.clothes_ecommerce.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.clothes_ecommerce.Entity.UserPaymentMethod;

public interface UserPaymentMethodRepository extends JpaRepository<UserPaymentMethod, Long>{

}
