package com.example.calculatorapi;

import org.springframework.boot.autoconfigure.integration.IntegrationProperties;
import org.springframework.http.HttpStatus;
import org.springframework.http.server.observation.ServerRequestObservationContext;
import org.springframework.web.bind.annotation.*;

import javax.management.BadAttributeValueExpException;
import java.net.HttpRetryException;

@RestController
@RequestMapping("/Calc")
public class Calc {

    @GetMapping("/mult")
    public Double multiplication(@RequestParam double a, @RequestParam double b){
        return method.multiplication(a,b);
    }

    @GetMapping("/sub")
    public Double subtraction(@RequestParam double a, @RequestParam double b){
        return method.subtraction(a,b);
    }

    @GetMapping("/div")
    public String division(@RequestParam double a, @RequestParam double b){
        return method.division(a,b);
    }

    public double div(double a, double b){
        return a/b;
    }
}
