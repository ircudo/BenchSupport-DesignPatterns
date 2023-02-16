package shape;

public class RedShapeDecorator extends ShapeDecorator {
    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public String draw() {
        setRedBorder();
        return decoratedShape.draw();
    }

    private void setRedBorder() {
        System.out.println("Border Color: Red");
    }
}
