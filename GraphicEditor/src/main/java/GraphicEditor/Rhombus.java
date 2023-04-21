package GraphicEditor;

public class Rhombus extends Shape {
    private final double diagonal1;
    private final double diagonal2;

    public Rhombus(double diagonal1, double diagonal2) {
        super("Rhombus");
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
    }

    public double getArea() {
        return (diagonal1 * diagonal2) / 2;
    }

    public double getPerimeter() {
        return 2 * Math.sqrt(Math.pow(diagonal1 / 2, 2) + Math.pow(diagonal2 / 2, 2));
    }
}

