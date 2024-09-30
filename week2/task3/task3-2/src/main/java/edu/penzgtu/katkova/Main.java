package edu.penzgtu.katkova;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("LADA Vesta", new Engine(70));
        Passenger passengerGavrilov = new Passenger("Гаврилов М.Д.");
        Passenger passengerKnyazev = new Passenger("Князев Я.М.");
        System.out.println(car);
        car.addPassenger(passengerGavrilov);
        System.out.println(car);
        car.addPassenger(passengerKnyazev);
        System.out.println(car);
        car.removePassenger(passengerGavrilov);
        System.out.println(car);
        car.addPassenger(new Passenger("Осипов М.Г."));
        System.out.println(car);
        car.removePassenger(new Passenger("Савин Р.Д."));
        System.out.println(car);
        car.removePassenger(passengerKnyazev);
        System.out.println(car);
    }
}
