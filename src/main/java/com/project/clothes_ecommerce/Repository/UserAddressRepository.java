package com.project.clothes_ecommerce.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.clothes_ecommerce.Entity.UserAddress;

public interface UserAddressRepository extends JpaRepository<UserAddress, Long>{

}
