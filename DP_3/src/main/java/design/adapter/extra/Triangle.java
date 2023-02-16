package design.adapter.extra;

public class Triangle implements GeometricShape {
    // sides
    private final double a;
    private final double b;
    private final double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double area() {
        // Heron's formula:
        // Area = SquareRoot(s * (s - a) * (s - b) * (s - c))
        // where s = (a + b + c) / 2, or 1/2 of the perimeter of the triangle
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    public double perimeter() {
        return a + b + c;
    }

    @Override
    public void drawShape() {
        System.out.println("Drawing Triangle with area: " + area() + " and perimeter: " + perimeter());
    }
}
