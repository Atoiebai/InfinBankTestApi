package com.infinbank.models;

public class Rectangle implements Shape{

    private final double firstSide;
    private final double secondSide;
    private double perimeter;
    private double square;

    public Rectangle(double firstSide, double secondSide) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    public void setPerimeter() {
        this.perimeter = (2 * (firstSide+secondSide));
    }

    public void setSquare() {
        this.square = firstSide * secondSide;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public double getSquare() {
        return square;
    }
}
