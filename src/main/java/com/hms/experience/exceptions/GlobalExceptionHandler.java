package com.hms.experience.exceptions;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(JobListNotFundException.class)
    public ResponseEntity<ExceptionResponse> handleJobListNotFound(JobListNotFundException exc) {
        ExceptionResponse error = getErrorMessage(exc.getMessage());
        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ExceptionResponse> handleGeneralException(Exception ex) {
        ExceptionResponse error = getErrorMessage(ex.getMessage());
        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }

    public ExceptionResponse getErrorMessage(String message) {
        ExceptionResponse error = new ExceptionResponse();
        error.setStatus(String.valueOf(HttpStatus.BAD_REQUEST.value()));
        error.setMessage(message);
        error.setTimeStamp(LocalDateTime.now().toString());
        return error;
    }

}
