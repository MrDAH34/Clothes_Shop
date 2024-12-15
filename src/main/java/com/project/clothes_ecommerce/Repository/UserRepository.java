package com.project.clothes_ecommerce.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.clothes_ecommerce.Entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, String>{

}
