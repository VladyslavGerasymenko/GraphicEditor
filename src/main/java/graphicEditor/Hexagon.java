package graphicEditor;

public class Hexagon extends Shape {
    private final double side;

    public Hexagon(double side) {
        super("Hexagon");
        this.side = side;
    }

    public double getArea() {
        return (3 * Math.sqrt(3) * Math.pow(side, 2)) / 2;
    }

    public double getPerimeter() {
        return 6 * side;
    }
}
