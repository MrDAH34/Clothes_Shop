package com.project.clothes_ecommerce.Exception;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.project.clothes_ecommerce.DTO.Response.APIResponse;

@ControllerAdvice
public class GlobalException {
    @ExceptionHandler(AppException.class)
    public ResponseEntity<APIResponse<?>> handleAppException(AppException e) {
        APIResponse<?> response = new APIResponse<>();
        response.setCode(e.getErrorCode().getCode());
        response.setMessage(e.getErrorCode().getMessage());
        return ResponseEntity.status(e.getErrorCode().getStatus()).body(response);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<APIResponse<?>> handleInvalidArgumentException(MethodArgumentNotValidException e) {
        FieldError fieldError = e.getFieldError();
        String enumKey = fieldError != null ? fieldError.getDefaultMessage() : "";
        APIResponse<?> apiResponse = new APIResponse<>();
        ErrorCode errorCode;
        try {
            errorCode = ErrorCode.valueOf(enumKey);
            System.out.println(errorCode.getMessage());
        } catch (IllegalArgumentException ex) {
            errorCode = ErrorCode.WRONG_ERROR_CODE;
        }

        apiResponse.setCode(errorCode.getCode());
        apiResponse.setMessage(errorCode.getMessage());
        return ResponseEntity.status(errorCode.getStatus()).body(apiResponse);
    }

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<APIResponse<?>> handleRunTimeException(RuntimeException e) {
        ErrorCode errorCode = ErrorCode.UNCATEGORIZED;
        APIResponse<?> response = new APIResponse<>();
        response.setCode(errorCode.getCode());
        response.setMessage(errorCode.getMessage());
        return ResponseEntity.status(errorCode.getStatus()).body(response);
    }
}
