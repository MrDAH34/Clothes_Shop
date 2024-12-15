package com.project.clothes_ecommerce.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project.clothes_ecommerce.DTO.Request.UserCreateRequest;
import com.project.clothes_ecommerce.DTO.Request.UserUpdateRequest;
import com.project.clothes_ecommerce.DTO.Response.UserResponse;
import com.project.clothes_ecommerce.Entity.User;
import com.project.clothes_ecommerce.Mapper.UserMapper;
import com.project.clothes_ecommerce.Repository.UserRepository;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)

public class UserService {
    UserRepository userRepository;
    UserMapper userMapper;

    public List<UserResponse> getAllUsers() {
        return userMapper.toUserResponseList(userRepository.findAll());
    }

    public UserResponse getUserById(String id) {
        User user = userRepository.findById(id).get();
        return userMapper.toUserResponse(user);
    }

    public void deleteUser(String id) {
        userRepository.deleteById(id);
    }

    public UserResponse saveUser(UserCreateRequest request) {
        User user = userMapper.CRequestToUser(request);
        return userMapper.toUserResponse(userRepository.save(user));
    }

    public UserResponse updateUser(String id, UserUpdateRequest request) {
        User user = userRepository.findById(id).get();
        userMapper.DRequestToUser(user, request);
        return userMapper.toUserResponse(userRepository.save(user));
    }
}
