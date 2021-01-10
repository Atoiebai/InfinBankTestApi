package com.infinbank.models;

public class Triangle implements Shape{

    private double firstSide;
    private double secondSide;
    private double thirdSide;
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

    public double getThirdSide() {
        return thirdSide;
    }

    public void setThirdSide(int thirdSide) {
        this.thirdSide = thirdSide;
    }

    public double getFirstSide() {
        return firstSide;
    }

    public void setFirstSide(int firstSide) {
        this.firstSide = firstSide;
    }

    public double getSecondSide() {
        return secondSide;
    }

    public void setSecondSide(int secondSide) {
        this.secondSide = secondSide;
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
