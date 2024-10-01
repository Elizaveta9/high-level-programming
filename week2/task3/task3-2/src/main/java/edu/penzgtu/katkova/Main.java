package edu.penzgtu.katkova;

public class Main {
    public static void main(String[] args) {
        // Определение машины
        Car car = new Car("LADA Vesta", new Engine(70));
        System.out.println(car);

        // Определение пассажиров
        Passenger passengerGavrilov = new Passenger("Гаврилов М.Д.");
        Passenger passengerKnyazev = new Passenger("Князев Я.М.");

        // Два пассажира зашли в машину
        car.addPassenger(passengerGavrilov);
        car.addPassenger(passengerKnyazev);
        System.out.println(car);

        // Для третьего нет места
        car.addPassenger(new Passenger("Осипов М.Г."));

        // Попытка убрать из машины несуществующего пассажира
        car.removePassenger(new Passenger("Савин Р.Д."));

        // Убрать существующего пассажира
        car.removePassenger(passengerGavrilov);
        System.out.println(car);
    }
}
