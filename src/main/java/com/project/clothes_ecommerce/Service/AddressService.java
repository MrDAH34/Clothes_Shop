package com.project.clothes_ecommerce.Service;

import org.springframework.stereotype.Service;

import com.project.clothes_ecommerce.DTO.Request.AddressCreateRequest;
import com.project.clothes_ecommerce.DTO.Request.AddressUpdateRequest;
import com.project.clothes_ecommerce.DTO.Response.AddressResponse;
import com.project.clothes_ecommerce.Entity.Address;
import com.project.clothes_ecommerce.Exception.AppException;
import com.project.clothes_ecommerce.Exception.ErrorCode;
import com.project.clothes_ecommerce.Mapper.AddressMapper;
import com.project.clothes_ecommerce.Repository.AddressRepository;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class AddressService {
    AddressRepository addressRepository;
    AddressMapper addressMapper;

    public AddressResponse getAddress(Long id) {
        Address address = addressRepository.findById(id)
                .orElseThrow(() -> new AppException(ErrorCode.ADDRESS_NOT_FOUND));
        return addressMapper.toAddressResponse(address);
    }

    public AddressResponse saveAddress(AddressCreateRequest request) {
        Address address = addressMapper.CToAddress(request);
        return addressMapper.toAddressResponse(addressRepository.save(address));
    }

    public AddressResponse updateAddress(Long id, AddressUpdateRequest request) {
        Address address = addressRepository.findById(id)
                .orElseThrow(() -> new AppException(ErrorCode.ADDRESS_NOT_FOUND));
        addressMapper.DToAddress(address, request);

        return addressMapper.toAddressResponse(addressRepository.save(address));
    }

    public void deleteAddress(Long id) {
        Address address = addressRepository.findById(id)
                .orElseThrow(() -> new AppException(ErrorCode.ADDRESS_NOT_FOUND));
        addressRepository.delete(address);
    }
}
