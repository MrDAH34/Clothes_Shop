package com.project.clothes_ecommerce.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.clothes_ecommerce.Entity.PaymentType;

public interface PaymentTypeRepository extends JpaRepository<PaymentType, Long>{

}
