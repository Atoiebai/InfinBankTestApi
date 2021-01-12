package com.infinbank.models;

public class Triangle implements Shape{

    private final double firstSide;
    private final double secondSide;
    private final double thirdSide;
    private double perimeter;
    private double square;

    public Triangle(double a, double b, double c) {
        if (a + b > c && a + c > b && b + c > a) {
            this.firstSide = a;
            this.secondSide = b;
            this.thirdSide = c;
        }
        else throw new IllegalArgumentException();
    }

    @Override
    public void setPerimeter() {
        this.perimeter = (firstSide + secondSide + thirdSide);
    }

    @Override
    public double getPerimeter() {
        return perimeter;
    }

    @Override
    public void setSquare() {
        double p = (firstSide + secondSide +firstSide)/2;
      this.square = Math.sqrt(p*((p-firstSide) * (p-secondSide) * (p - thirdSide)));
    }

    @Override
    public double getSquare() {
        return square;
    }

}
