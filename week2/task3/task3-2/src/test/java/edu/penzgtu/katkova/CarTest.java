package edu.penzgtu.katkova;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    void addPassenger() {
        Car car1 = new Car("", new Engine(1));
        Car car2 = new Car("", new Engine(1));
        Passenger p1 = new Passenger("1");
        Passenger p2 = new Passenger("2");
        Passenger p3 = new Passenger("3");

        car1.addPassenger(p1);
        car1.addPassenger(p2);
        car1.addPassenger(p3);
        car2.addPassenger(p1);
        car2.addPassenger(p2);

        assertEquals(car2.toString(), car1.toString());
    }

    @Test
    void removePassenger() {
        Car car1 = new Car("", new Engine(1));
        Car car2 = new Car("", new Engine(1));
        Passenger p1 = new Passenger("1");
        Passenger p2 = new Passenger("2");

        car1.addPassenger(p1);
        car1.addPassenger(p2);
        car1.removePassenger(p1);
        car1.removePassenger(p2);

        assertEquals(car2.toString(), car1.toString());
    }
}