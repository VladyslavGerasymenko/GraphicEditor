package graphicEditor;

public class Parallelogram extends Shape {
    private final double base;
    private final double height;
    private final double side;

    public Parallelogram(double base, double height, double side) {
        super("Parallelogram");
        this.base = base;
        this.height = height;
        this.side = side;
    }

    public double getArea() {
        return base * height;
    }

    public double getPerimeter() {
        return 2 * (base + side);
    }
}
