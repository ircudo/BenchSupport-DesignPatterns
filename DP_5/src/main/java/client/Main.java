package client;

import shape.*;

public class Main {
    public static void main(String[] args) {

        // create circle
        Circle circle = new Circle();
        // create red circle
        Shape redCircle = new RedShapeDecorator(new Circle());

        // crate red rectangle
        Shape redRectangle = new RedShapeDecorator(new Rectangle());

        // print all created shapes
        System.out.println("Circle with normal border: " + circle.draw());
        System.out.println("Circle with red border: " + redCircle.draw());
        System.out.println("Rectangle with red border: " + redRectangle.draw());

    }
}
