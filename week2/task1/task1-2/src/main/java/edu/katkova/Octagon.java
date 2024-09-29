package edu.katkova;

public class Octagon {
    private double innerRadius;

    public Octagon(double innerRadius) {
        this.innerRadius = innerRadius;
    }

    public double getInnerRadius() {
        return innerRadius;
    }

    public void setInnerRadius(double innerRadius) {
        this.innerRadius = innerRadius;
    }

    public double calculateArea() {
        return 8 * innerRadius * innerRadius * (Math.sqrt(2) - 1);
    }

    public double calculatePerimeter() {
        return (16 * innerRadius) / (1 + Math.sqrt(2));
    }
}
