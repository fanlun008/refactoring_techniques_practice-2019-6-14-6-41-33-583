package com.tws.refactoring.extract_method;

import com.tws.refactoring.extract_variable.PriceCalculator;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;

import static org.junit.Assert.*;

public class OwingPrinterTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void printOwing() {
        OwingPrinter printer = new OwingPrinter();
        printer.printOwing("John", Arrays.asList(new Order(20d), new Order(30d)));
    }

    @Test
    public void calcPrice() {
        PriceCalculator calculator = new PriceCalculator();
        double price = calculator.getPrice(10, 89);
        assertEquals(979.0d, price,0);
    }
}