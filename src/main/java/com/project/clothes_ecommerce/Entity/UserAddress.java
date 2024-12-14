package com.project.clothes_ecommerce.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Entity
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserAddress {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    Long id;

    @ManyToOne
    @JoinColumn(name= "user_id", nullable = false)
    User user;

    @ManyToOne
    @JoinColumn(name= "address_id", nullable = false)
    Address address;

    boolean isDefault;
}
