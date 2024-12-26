package com.project.clothes_ecommerce.Mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import com.project.clothes_ecommerce.DTO.Request.AddressCreateRequest;
import com.project.clothes_ecommerce.DTO.Request.AddressUpdateRequest;
import com.project.clothes_ecommerce.DTO.Response.AddressResponse;
import com.project.clothes_ecommerce.Entity.Address;

@Mapper(componentModel = "spring")
public interface AddressMapper {
    AddressResponse toAddressResponse(Address address);

    @Mapping(target = "id", ignore = true)
    Address CToAddress(AddressCreateRequest request);

    @Mapping(target = "id", ignore = true)
    Address DToAddress(@MappingTarget Address address, AddressUpdateRequest request);
}