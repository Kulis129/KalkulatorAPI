package com.example.calculatorapi;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.regex.Matcher;

@SpringBootTest
@AutoConfigureMockMvc
class CalculatorApiApplicationTests {

    @Autowired
    private MockMvc mock;

    @Test
    void contextLoads() {
    }

    @Test
    void multiplicationTest() throws Exception {
        mock.perform(MockMvcRequestBuilders.get("/Calc/mult?a=2&b=2"))
                .andExpect(MockMvcResultMatchers.jsonPath("$", Matchers.is(4.0)));
    }

    @Test
    void subtractionTest() throws Exception {
        mock.perform(MockMvcRequestBuilders.get("/Calc/sub?a=2&b=2"))
                .andExpect(MockMvcResultMatchers.jsonPath("$", Matchers.is(0.0)));
    }

    @Test
    void divisionTest() throws Exception {
        mock.perform(MockMvcRequestBuilders.get("/Calc/div?a=2&b=2"))
                .andExpect(MockMvcResultMatchers.jsonPath("$", Matchers.is(1.0)));
    }

    @Test
    void divisionErrorTest() throws Exception {
        mock.perform(MockMvcRequestBuilders.get("/Calc/div?a=2&b=0"))
                .andExpect(MockMvcResultMatchers.status().is(400))
                        .andExpect(MockMvcResultMatchers.jsonPath("$", Matchers.is("Nie można dzielić przez zero")));
    }

}
