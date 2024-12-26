package com.project.clothes_ecommerce.DTO.Request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
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
public class UserCreateRequest {
    @NotNull(message = "NULL_INPUT")
    String firstName;
    String lastName;
    @Email(message = "INVALID_EMAIL")
    @NotNull(message = "NULL_INPUT")
    String email;
    String phone;
    @Size(min = 8, message = "INVALID_PASSWORD_LENGTH")
    String password;
}
