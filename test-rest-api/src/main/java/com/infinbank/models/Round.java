package com.infinbank.models;


public class Round implements Shape{

    private final double radius;
    private double perimeter;
    private double square;

    public Round(double radius) {
        this.radius = radius;
    }

    @Override
    public void setPerimeter() {
        this.perimeter = 2 * Math.PI * radius;
    }

    public double getPerimeter() {
        return perimeter;
    }

    @Override
    public void setSquare() {
       this.square = (Math.PI * radius * radius);
    }

    @Override
    public double getSquare() {
        return square;
    }
}
