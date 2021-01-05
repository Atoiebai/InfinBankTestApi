package com.infinbank.models;

public class Shape {
    String shapesDescription;
    double square;
  double perimeter;

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public void setSquare(double x) {
     square = x;
    }
 public void setShapesDescription(String x) {
     shapesDescription = x;
    }

    public double getSquare() {
        return square;
    }

    public String getShapesDescription() {
        return shapesDescription;
    }
}
