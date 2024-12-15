package com.project.clothes_ecommerce.Controller.API;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.clothes_ecommerce.DTO.Request.UserCreateRequest;
import com.project.clothes_ecommerce.DTO.Request.UserUpdateRequest;
import com.project.clothes_ecommerce.DTO.Response.APIResponse;
import com.project.clothes_ecommerce.DTO.Response.UserResponse;
import com.project.clothes_ecommerce.Service.UserService;

@RestController
@RequestMapping("api/users")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping
    APIResponse<List<UserResponse>> getAllUser() {
        APIResponse<List<UserResponse>> response = new APIResponse<>();
        response.setCode(200);
        response.setMessage("Success");
        response.setData(userService.getAllUsers());
        return response;
    }

    @GetMapping("/{id}")
    APIResponse<UserResponse> getUserById(@PathVariable String id) {
        APIResponse<UserResponse> response = new APIResponse<>();
        response.setCode(200);
        response.setMessage("Success");
        response.setData(userService.getUserById(id));
        return response;
    }

    @PostMapping
    APIResponse<UserResponse> saveUser(@RequestBody UserCreateRequest request) {
        APIResponse<UserResponse> response = new APIResponse<>();
        response.setCode(200);
        response.setMessage("Success");
        response.setData(userService.saveUser(request));
        return response;
    }

    @PutMapping("/{id}")
    APIResponse<UserResponse> updateUser(@PathVariable String id, @RequestBody UserUpdateRequest request) {
        APIResponse<UserResponse> response = new APIResponse<>();
        response.setCode(200);
        response.setMessage("Success");
        response.setData(userService.updateUser(id, request));
        return response;
    }

    @DeleteMapping("/{id}")
    APIResponse<Void> deleteUser(@PathVariable String id) {
        APIResponse<Void> response = new APIResponse<>();
        response.setCode(200);
        response.setMessage("Success");
        userService.deleteUser(id);
        return response;
    }
}
