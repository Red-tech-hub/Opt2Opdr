package com.company;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class AutoTest {

    @Test
    public void testPrice() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        BMW bmw = new BMW();
        bmw.price();
        assertEquals("45000 euro\n", outContent.toString());
        System.setOut(System.out);
    }

    @Test
    public void testMaximaleSnelheid() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        Audi audi = new Audi();
        audi.Maximale_snelheid();
        assertEquals("Aantal km/u: 280\n", outContent.toString());
        System.setOut(System.out);
    }

    @Test
    public void testMerk() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        Lamborghini lambo = new Lamborghini();
        lambo.merk();
        assertEquals("Merknaam: lamborghini\n", outContent.toString());
        System.setOut(System.out);
    }
}
