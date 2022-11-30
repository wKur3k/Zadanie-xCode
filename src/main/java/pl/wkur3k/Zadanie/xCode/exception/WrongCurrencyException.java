package pl.wkur3k.Zadanie.xCode.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class WrongCurrencyException extends RuntimeException{
    private static final long serialVersionUID = 1L;
    private String message;
}
