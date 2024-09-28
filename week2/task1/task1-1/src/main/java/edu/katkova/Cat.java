package edu.katkova;

public class Cat {
    private String name;
    private String color;
    private double weightKg;
    private int age;

    /*
    Значения по умолчанию:
        name = "invisible";
        color = "John";
        weightKg = 0.0;
        age = 0;
     */
    public Cat() {
        this.color = "invisible";
        this.name = "John";
    }


    public Cat(String name, String color, double weightKg, int age) {
        this.name = name;
        this.color = color;

        // Если weightKg меньше нуля, то установится 0.0 (в сеттере также)
        if (weightKg >= 0) {
            this.weightKg = weightKg;
        }

        // Если age меньше нуля, то установится 0 (в сеттере также)
        if (age >= 0) {
            this.age = age;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeightKg() {
        return weightKg;
    }

    public void setWeightKg(double weightKg) {
        if (weightKg >= 0) {
            this.weightKg = weightKg;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }
    }

    @Override
    public String toString() {
        return String.format("%s cat %s: age %d, weight(kg) %.1f", color, name, age, weightKg);
    }
}
