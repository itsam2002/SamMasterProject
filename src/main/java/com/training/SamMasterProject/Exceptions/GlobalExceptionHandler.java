package com.training.SamMasterProject.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(SalaryException.class)
    public ResponseEntity<?> handleSalaryException(SalaryException ex) {
        return ResponseEntity
                .status(HttpStatus.BAD_REQUEST)
                .body(Map.of(
                        "error", ex.getMessage(),
                        "status", HttpStatus.BAD_REQUEST.value()
                )); }

    @ExceptionHandler(AddressException.class)
    public ResponseEntity<?> handleAddressException(AddressException ex) {
        return ResponseEntity
                .status(HttpStatus.BAD_REQUEST)
                .body(Map.of(
                        "error", ex.getMessage(),
                        "status", HttpStatus.BAD_REQUEST.value()
                )); }

    @ExceptionHandler(EidNotfound.class)
    public ResponseEntity<?> handleIdException(EidNotfound ex) {
        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body(Map.of(
                        "status", HttpStatus.NOT_FOUND.value(),
                        "error", ex.getMessage()
                )); }
}
