package graphicEditor;

public class Decagon extends Shape {
    private final double sideLength;

    public Decagon(double sideLength) {
        super("Decagon");
        this.sideLength = sideLength;
    }

    @Override
    public double getArea() {
        return (5 * sideLength * sideLength) / (4 * Math.tan(Math.PI / 10));
    }

    @Override
    public double getPerimeter() {
        return 10 * sideLength;
    }
}
