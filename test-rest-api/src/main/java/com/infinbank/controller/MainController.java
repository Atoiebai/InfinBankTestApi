package com.infinbank.controller;

import com.infinbank.models.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Every method of controller used to
 * create new Object
 * based on HttpRequest parameters
 *
 * Each method checks if arguments are appropriate, returns BAD_REQUEST if they are not
 */


@RestController
@RequestMapping(value = "/shape")
public class MainController {

    /**
     * @param a is a first side
     * @param b is a second side
     * @param c is a third side
     * @return Triangle in JSON or Bad Request
     */
    @GetMapping("/triangle")
    public ResponseEntity<Shape> getTriangle(@PathVariable double a,@PathVariable double b,@PathVariable double c) {
        //Shapes side should be positive
        if (a <= 0 || b <= 0 || c <= 0) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        Triangle triangle = new Triangle(a, b, c);

        //inserts values into variables perimeter and square
        triangle.setPerimeter();
        triangle.setSquare();
        return new ResponseEntity<>(triangle, HttpStatus.OK);
    }

    /**
     * @param a is a side of square
     * @return Square in JSON or Bad Request
     */
    @GetMapping("/square")
    public ResponseEntity<Shape> getSquare(double a) {
        //Shapes side should be positive
        if (a <= 0) return new ResponseEntity<>(HttpStatus.BAD_REQUEST);

        Square square = new Square(a);

        //inserts values into variables perimeter and square
        square.setPerimeter();
        square.setSquare();

        return new ResponseEntity<>(square, HttpStatus.OK);
    }

    /**
     * @param a is a rounds radius
     * @return Round in JSON or Bad Request
     */
    @GetMapping("/round")
    public ResponseEntity<Shape> getRound(double a) {
        //Shapes radius should be positive
        if (a <= 0) return new ResponseEntity<>(HttpStatus.BAD_REQUEST);

        Round round = new Round(a);

        //inserts values into variables perimeter and square
        round.setSquare();
        round.setPerimeter();

        return new ResponseEntity<>(round, HttpStatus.OK);
    }

    /**
     * @param a is a width of Rectangle
     * @param b is a height of Rectangle
     * @return Rectangle in JSON or Bad Request
     */
    @GetMapping("/rectangle")
    public ResponseEntity<Shape> getRectangle(double a, double b) {
        //Shapes side should be positive
        if (a <= 0 || b <= 0) return new ResponseEntity<>(HttpStatus.BAD_REQUEST);

        Rectangle rectangle = new Rectangle(a, b);

        //inserts values into variables perimeter and square
        rectangle.setSquare();
        rectangle.setPerimeter();

        return new ResponseEntity<>(rectangle, HttpStatus.OK);
    }

}
