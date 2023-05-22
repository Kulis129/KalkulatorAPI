package com.example.calculatorapi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class methodTest {
    @Test
    public void add()
    {
        assertEquals(3,method.add(1,2));
    }

    @Test
    public void subtraction()
    {
        assertEquals(-1,method.subtraction(1,2));
    }

    @Test
    public void division()
    {
        assertEquals("1.0",method.division(2,2));
    }

    @Test
    public void multiplication()
    {
        assertEquals(2,method.multiplication(1,2));
    }
}
