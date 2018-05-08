package com.kodilla.spring.calculator;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class Calculator {

    @Bean
    public Display displayValue(){
        return new Display();
}
    public double add(double a, double b){
        displayValue();
        return a+b;
    }

    public double sub(double a, double b){
        displayValue();
        return a-b;
    }

    public double mul(double a, double b){
        displayValue();
        return a*b;
    }

    public double div(double a, double b){
        displayValue();
        return a/b;
    }

}
