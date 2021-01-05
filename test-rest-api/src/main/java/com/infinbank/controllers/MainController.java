package com.infinbank.controllers;

import com.infinbank.models.Shape;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 *  Every method of controller used to
 *  create new Object and calculate variables values
 *  based on HttpRequest parameters
 */


@RestController
@RequestMapping(value = "/shape")
public class MainController {

    @GetMapping("/triangle")
    public ResponseEntity<Shape> getTriangle(HttpServletRequest request) {
        Shape triangle = new Shape();
        triangle.setShapesDescription("Triangle");

        double a;
        double b;
        double c;

        try {
             a = Double.parseDouble(request.getParameter("a"));
             b = Double.parseDouble(request.getParameter("b"));
             c = Double.parseDouble(request.getParameter("c"));
        }
        catch (NumberFormatException e) {
            return new ResponseEntity<>( HttpStatus.BAD_REQUEST);
        }

        if (a + c > b && a + b > c && c + b > a) {

            double p = (a + b + c) / 2;
            triangle.setPerimeter(p * 2);
          triangle.setSquare(Math.sqrt(p * (p - a) * (p - b) * (p - c)));

        }

        return new ResponseEntity<>(triangle , HttpStatus.OK);
    }

    @GetMapping("/square")
    public ResponseEntity<Shape> getSquare(HttpServletRequest request) {

        Shape square = new Shape();
        square.setShapesDescription("Square");

        double sideSize;

        try {
            sideSize = Double.parseDouble(request.getParameter("a"));
        }
        catch (NumberFormatException e) {
            return new ResponseEntity<>( HttpStatus.BAD_REQUEST);
        }

        if(sideSize < 0)  return new ResponseEntity<>(HttpStatus.BAD_REQUEST);

            square.setPerimeter(sideSize * 4);
            square.setSquare(sideSize * sideSize);

        return new ResponseEntity<>(square , HttpStatus.OK);

    }
    @GetMapping("/round")
    public ResponseEntity<Shape> getRound(HttpServletRequest request) {

        Shape round = new Shape();
        round.setShapesDescription("Round");

        //declares as a radius
        double radius;
        try {
            radius = Double.parseDouble(request.getParameter("a"));
        }
        catch (NumberFormatException e) {
            return new ResponseEntity<>( HttpStatus.BAD_REQUEST);
        }

        if(radius < 0) return new ResponseEntity<>(HttpStatus.BAD_REQUEST);

        //constant value of Pi number
        final double p = 3.14;

        round.setSquare(p * radius * radius);
        round.setPerimeter(2 * p * radius);

        return new ResponseEntity<>(round , HttpStatus.OK);
    }

    @GetMapping("/rectangle")
    public ResponseEntity<Shape> getRectangle(HttpServletRequest request) {
        Shape rectangle = new Shape();
        rectangle.setShapesDescription("Rectangle");

        double a ;
        double b;

        try {
          a =  Double.parseDouble(request.getParameter("a"));
          b =  Double.parseDouble(request.getParameter("b"));
        }
        catch (NumberFormatException e) {
            return new ResponseEntity<> (HttpStatus.BAD_REQUEST);
        }


        if (a >= 0 && b >= 0) {
            rectangle.setPerimeter(2 * (a + b));
            rectangle.setSquare(a * b);
        }
        return new ResponseEntity<>(rectangle , HttpStatus.OK);
    }

}
