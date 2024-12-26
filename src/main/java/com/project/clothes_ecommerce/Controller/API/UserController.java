package com.project.clothes_ecommerce.Controller.Api;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.clothes_ecommerce.DTO.Request.AddressCreateRequest;
import com.project.clothes_ecommerce.DTO.Request.AddressUpdateRequest;
import com.project.clothes_ecommerce.DTO.Request.UserCreateRequest;
import com.project.clothes_ecommerce.DTO.Request.UserUpdateRequest;
import com.project.clothes_ecommerce.DTO.Response.APIResponse;
import com.project.clothes_ecommerce.DTO.Response.AddressResponse;
import com.project.clothes_ecommerce.DTO.Response.UserResponse;
import com.project.clothes_ecommerce.Service.AddressService;
import com.project.clothes_ecommerce.Service.UserService;

import jakarta.validation.Valid;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class UserController {

    UserService userService;
    AddressService addressService;

    // User Management
    @GetMapping
    APIResponse<List<UserResponse>> getAllUser() {
        APIResponse<List<UserResponse>> response = new APIResponse<>();
        response.setData(userService.getAllUsers());
        return response;
    }

    @GetMapping("/{id}")
    APIResponse<UserResponse> getUserById(@PathVariable String id) {
        APIResponse<UserResponse> response = new APIResponse<>();
        response.setData(userService.getUserById(id));
        return response;
    }

    @PostMapping
    APIResponse<UserResponse> saveUser(@RequestBody @Valid UserCreateRequest request) {
        APIResponse<UserResponse> response = new APIResponse<>();
        response.setData(userService.saveUser(request));
        return response;
    }

    @PutMapping("/{id}")
    APIResponse<UserResponse> updateUser(@PathVariable String id, @RequestBody UserUpdateRequest request) {
        APIResponse<UserResponse> response = new APIResponse<>();
        response.setData(userService.updateUser(id, request));
        return response;
    }

    @DeleteMapping("/{id}")
    APIResponse<UserResponse> deleteUser(@PathVariable String id) {
        APIResponse<UserResponse> response = new APIResponse<>();
        userService.deleteUser(id);
        return response;
    }

    // Address Management
    @GetMapping("/addresses/{id}")
    public APIResponse<AddressResponse> getAddress(@PathVariable Long id) {
        APIResponse<AddressResponse> response = new APIResponse<>();
        response.setData(addressService.getAddress(id));
        return response;
    }

    @PutMapping("/addresses/{id}")
    public APIResponse<AddressResponse> updateAddress(@PathVariable Long id,
            @RequestBody AddressUpdateRequest request) {
        APIResponse<AddressResponse> response = new APIResponse<>();
        response.setData(addressService.updateAddress(id, request));
        return response;
    }

    @PostMapping("/addresses")
    public APIResponse<AddressResponse> saveAddress(@RequestBody AddressCreateRequest request) {
        APIResponse<AddressResponse> response = new APIResponse<>();
        response.setData(addressService.saveAddress(request));
        return response;
    }

    @DeleteMapping("/addresses/{id}")
    public APIResponse<AddressResponse> deleteAddress(@PathVariable Long id) {
        APIResponse<AddressResponse> response = new APIResponse<>();
        addressService.deleteAddress(id);
        return response;
    }
}
