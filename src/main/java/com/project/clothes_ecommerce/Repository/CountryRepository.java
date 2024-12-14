package com.project.clothes_ecommerce.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.clothes_ecommerce.Entity.Country;

public interface CountryRepository extends JpaRepository<Country, Long>{

}
