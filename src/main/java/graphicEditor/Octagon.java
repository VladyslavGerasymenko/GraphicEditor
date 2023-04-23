package graphicEditor;

public class Octagon extends Shape {
    private final double side;

    public Octagon(double side) {
        super("Octagon");
        this.side = side;
    }

    public double getArea() {
        return 2 * (1 + Math.sqrt(2)) * Math.pow(side, 2);
    }

    public double getPerimeter() {
        return 8 * side;
    }
}

