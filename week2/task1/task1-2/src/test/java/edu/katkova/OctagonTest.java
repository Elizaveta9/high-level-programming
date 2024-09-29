package edu.katkova;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class OctagonTest {
    @Test
    public void shouldBeEqualCalculateArea() {
        Octagon octagon = new Octagon(1.73717);
        assertEquals("10,00", String.format("%.2f", octagon.calculateArea()));
    }

    @Test
    public void shouldBeEqualCalculatePerimeter() {
        Octagon octagon = new Octagon(1.50888);
        assertEquals("10,00", String.format("%.2f", octagon.calculatePerimeter()));
    }
}
