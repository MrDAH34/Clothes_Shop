package com.project.clothes_ecommerce.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.clothes_ecommerce.Entity.Address;

public interface AddressRepository extends JpaRepository<Address, Long>{

}
