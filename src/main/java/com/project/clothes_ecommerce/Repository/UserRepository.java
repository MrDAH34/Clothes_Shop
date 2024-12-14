package com.project.clothes_ecommerce.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.clothes_ecommerce.Entity.User;

public interface UserRepository extends JpaRepository<User, String>{

}
