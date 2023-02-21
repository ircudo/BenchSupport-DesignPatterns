package design.adapter.classAdapter;

import design.adapter.*;
import design.adapter.extra.*;

public class TriangleAdapter extends Triangle implements Shape {
    public TriangleAdapter(double a, double b, double c) {
        super(a, b, c);
    }

    @Override
    public void draw() {
        this.drawShape();
    }

    @Override
    public void resize() {
        System.out.println("Triangle cannot be resized");
    }

    @Override
    public String description() {
        return "Triangle description";
    }
}
