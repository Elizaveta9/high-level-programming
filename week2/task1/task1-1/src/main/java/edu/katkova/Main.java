package edu.katkova;

public class Main {
    public static void main(String[] args) {
        //Определение кота через конструктор с параметрами
        Cat catSunny = new Cat("Sunny", "white", 6.4, 5);
        System.out.println(catSunny);

        //Определение кота через переписанный конструктор по умолчанию
        Cat catDefault = new Cat();
        System.out.println(catDefault);
    }
}
