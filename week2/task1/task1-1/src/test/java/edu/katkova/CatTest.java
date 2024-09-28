package edu.katkova;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CatTest {

    @Test
    public void shouldBeEqual() {
        Cat catDefault = new Cat();
        Cat catWithParameters = new Cat("John", "invisible", 0.0, 0);

        assertEquals(catDefault.toString(), catWithParameters.toString());
    }

    @Test
    public void noNegativeNumbersViaConstructor() {
        Cat cat = new Cat("", "", -2, -2);

        assertEquals(cat.getAge(), 0);
        assertEquals(cat.getWeightKg(), 0.0);
    }

    @Test
    public void noNegativeNumbersViaSetters() {
        Cat catDefault = new Cat();

        catDefault.setAge(-3);
        catDefault.setWeightKg(-3.2);

        assertEquals(catDefault.getAge(), 0);
        assertEquals(catDefault.getWeightKg(), 0.0);
    }
}