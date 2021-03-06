package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class CalculatorTestSuite {

    @Test
    public void testAdd() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Display display = context.getBean(Display.class);
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double result = display.displayValue(8);
        double result1 = calculator.add(5, 3);
        //Then
        Assert.assertEquals(8, result, 0);
        Assert.assertEquals(8, result1, 0);
    }

    @Test
    public void testSub() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Display display = context.getBean(Display.class);
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double result1 = display.displayValue(2);
        double sub = calculator.sub(5, 3);
        //Then
        Assert.assertEquals(2, result1, 0);
        Assert.assertEquals(2, sub, 0);
    }

    @Test
    public void testMul() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Display display = context.getBean(Display.class);
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double result2 = display.displayValue(15);
        double mul = calculator.mul(5, 3);
        //Then
        Assert.assertEquals(15, result2, 0);
        Assert.assertEquals(15, mul, 0);
    }

    @Test
    public void testDiv() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Display display = context.getBean(Display.class);
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double result3 = display.displayValue(1.7);
        double div = calculator.div(5, 3);
        //Then
        Assert.assertEquals(1.7, result3, 0.1);
        Assert.assertEquals(1.7, div, 0.1);
    }
}