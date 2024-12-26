package com.project.clothes_ecommerce.DTO.Request;

import com.project.clothes_ecommerce.Entity.Country;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class AddressUpdateRequest {
    String houseNumber;
    String streetName;
    String city;
    Country country;
    String zipCode;
}
