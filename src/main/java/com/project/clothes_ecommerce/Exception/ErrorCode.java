package com.project.clothes_ecommerce.Exception;

import org.springframework.http.HttpStatus;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public enum ErrorCode {
    UNCATEGORIZED(500, "Something went wrong", HttpStatus.INTERNAL_SERVER_ERROR),
    NULL_INPUT(400, "This field cannot be null", HttpStatus.BAD_REQUEST),
    INVALID_EMAIL(400, "Invalid email", HttpStatus.BAD_REQUEST),
    WRONG_ERROR_CODE(500, "Your request has an invalid error code", HttpStatus.INTERNAL_SERVER_ERROR),
    INVALID_PASSWORD_LENGTH(400, "Your password must be at least 8 characters", HttpStatus.BAD_REQUEST),
    USER_EXISTS(400, "User already exists", HttpStatus.BAD_REQUEST),
    ADDRESS_NOT_FOUND(404, "Address not found", HttpStatus.NOT_FOUND),
    USER_NOT_FOUND(404, "User not found", HttpStatus.NOT_FOUND);

    int code;
    String message;
    HttpStatus status;

    private ErrorCode(int code, String message, HttpStatus status) {
        this.code = code;
        this.message = message;
        this.status = status;
    }

}
