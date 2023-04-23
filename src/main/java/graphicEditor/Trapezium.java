package graphicEditor;

public class Trapezium extends Shape {
    private final double base1;
    private final double base2;
    private final double height;
    private final double side1;
    private final double side2;

    public Trapezium(double base1, double base2, double height, double side1, double side2) {
        super("Trapezium");
        this.base1 = base1;
        this.base2 = base2;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
    }

    public double getArea() {
        return (base1 + base2) / 2 * height;
    }

    public double getPerimeter() {
        return base1 + base2 + side1 + side2;
    }
}
