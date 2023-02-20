package client;

import design.adapter.*;
public class TestNoAdapter {
    public static void main(String[] args) {
        testDrawing();
    }

    private static void testDrawing() {
        System.out.println("Creating drawing of shapes...");
        Drawing drawing = new Drawing();
        drawing.addShape(new Rectangle());
        drawing.addShape(new Circle());

        System.out.println("Drawing...");
        drawing.draw();
        System.out.println("Resizing...");
        drawing.resize();
    }
}
