package graphicEditor;

public class Pentagon extends Shape {
    private final double side;

    public Pentagon(double side) {
        super("Pentagon");
        this.side = side;
    }

    public double getArea() {
        return 0.25 * Math.sqrt(5.0 * (5.0 + 2.0 * Math.sqrt(5.0))) * side * side;
    }

    public double getPerimeter() {
        return 5.0 * side;
    }
}
