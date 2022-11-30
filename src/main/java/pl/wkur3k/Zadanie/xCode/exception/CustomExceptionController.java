package pl.wkur3k.Zadanie.xCode.exception;

import org.springframework.core.convert.ConversionFailedException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class CustomExceptionController {
    @ExceptionHandler(NullPointerInArrayException.class)
    public ResponseEntity<Object> exception(NullPointerInArrayException exception){
        return new ResponseEntity<>("One of the elements in number array is null or not integer.", HttpStatus.BAD_REQUEST);
    }
    @ExceptionHandler(WrongCurrencyException.class)
    public ResponseEntity<Object> exception(WrongCurrencyException exception){
        return new ResponseEntity<>(exception.getMessage(), HttpStatus.NOT_FOUND);
    }
}
