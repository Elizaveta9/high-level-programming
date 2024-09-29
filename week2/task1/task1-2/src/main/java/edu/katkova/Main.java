package edu.katkova;

public class Main {
    public static void main(String[] args) {
        Octagon octagon = new Octagon(42.42);
        System.out.printf("Восьмиугольник: \n" +
                        "- радиус вписанной окружности = %.2f см\n" +
                        "- площадь = %.2f см^2\n" +
                        "- периметр = %.2f см",
                octagon.getInnerRadius(), octagon.calculateArea(), octagon.calculatePerimeter());
    }
}
