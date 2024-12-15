package com.project.clothes_ecommerce.Mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import com.project.clothes_ecommerce.DTO.Request.UserCreateRequest;
import com.project.clothes_ecommerce.DTO.Request.UserUpdateRequest;
import com.project.clothes_ecommerce.DTO.Response.UserResponse;
import com.project.clothes_ecommerce.Entity.User;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserResponse toUserResponse(User user);

    List<UserResponse> toUserResponseList(List<User> users);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "password", ignore = true)
    User toUser(UserResponse userResponse);

    @Mapping(target = "id", ignore = true)
    User CRequestToUser(UserCreateRequest request);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "email", ignore = true)
    @Mapping(target = "phone", ignore = true)
    void DRequestToUser(@MappingTarget User user, UserUpdateRequest request);
}
