package com.project.clothes_ecommerce.Entity;

import java.math.BigDecimal;
import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
public class ShopOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @CreationTimestamp
    Date orderDate;
    BigDecimal orderTotal;
    String orderStatus;

    @ManyToOne
    @JoinColumn(name = "payment_method_id")
    UserPaymentMethod userPaymentMethod;

    @ManyToOne
    @JoinColumn(name = "shipping_address_id")
    Address shippingAddress;

    @ManyToOne
    @JoinColumn(name = "shipping_method_id")
    ShippingMethod shippingMethod;
}
