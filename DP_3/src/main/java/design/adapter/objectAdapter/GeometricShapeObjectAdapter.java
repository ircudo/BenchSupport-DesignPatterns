package design.adapter.objectAdapter;

import design.adapter.*;
import design.adapter.extra.*;

public class GeometricShapeObjectAdapter implements Shape {

    private GeometricShape adaptee;

    public GeometricShapeObjectAdapter(GeometricShape adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void draw() {
        adaptee.drawShape();
    }

    @Override
    public void resize() {
        System.out.println(description() + "can't be resized");
    }

    @Override
    public String description() {
        if (adaptee instanceof Triangle) {
            return "Triangle";
        } else if (adaptee instanceof Rhombus) {
            return "Rhombus";
        } else return "Unknown";
    }
}
