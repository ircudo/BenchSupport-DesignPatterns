package design.adapter.classAdapter;

import design.adapter.*;
import design.adapter.extra.*;

public class RhombusAdapter extends Rhombus implements Shape {
    public RhombusAdapter(double a, double b) {
        super(a, b);
    }

    @Override
    public void draw() {
        super.drawShape();
    }

    @Override
    public void resize() {
        System.out.println("Rhombus cannot be resized");
    }

    @Override
    public String description() {
        return "Rhombus object";
    }
}
