package client;

import design.adapter.*;
import design.adapter.extra.*;
import design.adapter.objectAdapter.*;

public class TestObjectAdapter {
    public static void main(String[] args) {
        testObjectAdapter();
    }

    private static void testObjectAdapter() {
        System.out.println("Creating drawing of shapes...");

        // create instance of drawing
        Drawing drawing = new Drawing();

        // add shapes to drawing: rectangle, circle as new Rectangle(), new Circle()
        drawing.addShape(new Rectangle());
        drawing.addShape(new Circle());

        // add shapes to drawing: triangle, rhombus using GeometricShapeObjectAdapter
        drawing.addShape(new GeometricShapeObjectAdapter(new Triangle(3,4,5)));
        drawing.addShape(new GeometricShapeObjectAdapter(new Rhombus(3,4)));

        System.out.println("Drawing...");
        // do drawing
        drawing.draw();
        System.out.println("Resizing...");
        // resize drawing
        drawing.resize();
    }
}
