package com.example.dockercompose.controller;

import com.example.dockercompose.exception.ApiError;
import com.example.dockercompose.exception.PersonNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionController {

    @ExceptionHandler(PersonNotFoundException.class)
    protected ResponseEntity<ApiError> personNotFound(PersonNotFoundException e) {
        ApiError api = new ApiError("Person is not found", e.getMessage());
        return new ResponseEntity<>(api, HttpStatus.NOT_FOUND);
    }
}