package com.infinbank.controller;

import com.infinbank.models.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Every method of controller used to
 * create new Object and calculate variables values
 * based on HttpRequest parameters
 */


@RestController
@RequestMapping(value = "/shape")
public class MainController {

    @GetMapping("/triangle")
    public ResponseEntity<Shape> getTriangle(double a, double b, double c) {
        if (a <= 0 || b <= 0 || c <= 0) return new ResponseEntity<>(HttpStatus.BAD_REQUEST);

        Triangle triangle = new Triangle(a, b, c);

        triangle.setPerimeter();
        triangle.setSquare();
        return new ResponseEntity<>(triangle, HttpStatus.OK);
    }

    @GetMapping("/square")
    public ResponseEntity<Shape> getSquare(double a) {
        if (a <= 0) return new ResponseEntity<>(HttpStatus.BAD_REQUEST);

        Square square = new Square(a);
        square.setPerimeter();
        square.setSquare();

        return new ResponseEntity<>(square, HttpStatus.OK);
    }

    @GetMapping("/round")
    public ResponseEntity<Shape> getRound(double radius) {
        if (radius <= 0) return new ResponseEntity<>(HttpStatus.BAD_REQUEST);

        Round round = new Round(radius);

        round.setSquare();
        round.setPerimeter();

        return new ResponseEntity<>(round, HttpStatus.OK);
    }

    @GetMapping("/rectangle")
    public ResponseEntity<Shape> getRectangle(double firstSide, double secondSide) {
        if (firstSide <= 0 || secondSide <= 0) return new ResponseEntity<>(HttpStatus.BAD_REQUEST);

        Rectangle rectangle = new Rectangle(firstSide, secondSide);

        rectangle.setSquare();
        rectangle.setPerimeter();

        return new ResponseEntity<>(rectangle, HttpStatus.OK);
    }

}
