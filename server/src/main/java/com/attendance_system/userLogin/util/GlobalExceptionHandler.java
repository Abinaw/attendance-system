package com.attendance_system.userLogin.util;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity <String> handleValidationExceptions(MethodArgumentNotValidException ex){
        log.error("Validation error: {}",ex.getMessage());
        String response = ex.getBindingResult().getFieldErrors().getFirst().getDefaultMessage();
        return new ResponseEntity<>(response,HttpStatus.BAD_REQUEST);
    }

}
