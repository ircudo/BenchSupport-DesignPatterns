package testPattern;

import design.adapter.*;
import design.adapter.classAdapter.*;

public class TestClassAdapter {
    public static void main(String[] args) {
        testClassAdapter();
    }

    private static void testClassAdapter() {
        System.out.println("Creating drawing of shapes...");

        // create instance of drawing

        // add shapes to drawing: rectangle, circle as new Rectangle(), new Circle()

        // add shapes to drawing: triangle, rhombus using corresponding adapters

        System.out.println("Drawing...");
        // do drawing
        System.out.println("Resizing...");
        // resize drawing
    }
}
