package com.example.calculatorapi;

public class ZeroDiv extends RuntimeException {
    public ZeroDiv() {
        super("Nie można dzielić przez zero");
    }
}
