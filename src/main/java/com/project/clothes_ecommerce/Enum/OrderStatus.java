package com.project.clothes_ecommerce.Enum;

import lombok.Getter;

@Getter
public enum OrderStatus {
    PENDING,
    PROCESSING,
    SHIPPED,
    DELIVERED,
    CANCELLED;
}
