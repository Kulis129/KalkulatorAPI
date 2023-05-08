package com.example.calculatorapi;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ZeroDIvAdvice {
    @ResponseBody
    @ExceptionHandler(ZeroDiv.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public String zeroDivHandler( ZeroDiv msg) {
        return msg.getMessage();
    }
}
