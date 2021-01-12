package com.infinbank.models;

public class Square implements Shape{

    private final double eachSide;
    private double perimeter;
    private double square;

    public Square(double eachSide) {
        this.eachSide = eachSide;
    }

    @Override
    public void setPerimeter() {
        this.perimeter = eachSide * 4;
    }

    public double getPerimeter() {
        return perimeter ;
    }

    @Override
    public void setSquare() {
       this.square = eachSide * eachSide;
    }

    public double getSquare() {
        return square ;
    }


}
