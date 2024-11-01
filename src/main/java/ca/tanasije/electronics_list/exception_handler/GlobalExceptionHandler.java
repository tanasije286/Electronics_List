package ca.tanasije.electronics_list.exception_handler;

import ca.tanasije.electronics_list.exception.LaptopAlreadyExistsException;
import ca.tanasije.electronics_list.exception.NoSuchLaptopExistsException;
import ca.tanasije.electronics_list.error_response.ErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value= NoSuchLaptopExistsException.class)
    public ResponseEntity<ErrorResponse> NoSuchLaptopExistsException(NoSuchLaptopExistsException ex){
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new ErrorResponse(HttpStatus.NOT_FOUND.value(), ex.getMessage()));
    }

    @ExceptionHandler(value= LaptopAlreadyExistsException.class)
    public ResponseEntity<ErrorResponse> LaptopAlreadyExistsException(LaptopAlreadyExistsException ex){
        return ResponseEntity.status(HttpStatus.CONFLICT).body(new ErrorResponse(HttpStatus.CONFLICT.value(), ex.getMessage()));
    }
}
