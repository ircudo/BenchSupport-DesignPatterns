package client;

import design.adapter.*;
import design.adapter.classAdapter.*;
import design.adapter.extra.*;

public class TestClassAdapter {
    public static void main(String[] args) {
        testClassAdapter();
    }

    private static void testClassAdapter() {
        System.out.println("Creating drawing of shapes...");

        // create instance of drawing
        Drawing drawing = new Drawing();

        // add shapes to drawing: rectangle, circle as new Rectangle(), new Circle()
        drawing.addShape(new Rectangle());
        drawing.addShape(new Circle());

        // add shapes to drawing: triangle, rhombus using corresponding adapters
        drawing.addShape(new TriangleAdapter(10, 12, 15));
        drawing.addShape(new RhombusAdapter(10, 14));

        System.out.println("Drawing...");
        // do drawing
        drawing.draw();
        System.out.println("Resizing...");
        // resize drawing
        drawing.resize();

    }
}
