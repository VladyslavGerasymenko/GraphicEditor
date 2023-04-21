package GraphicEditor;

public class Quad extends Shape {
    private final double side1;
    private final double side2;
    private final double side3;
    private final double side4;

    public Quad(double side1, double side2, double side3, double side4) {
        super("Quad");
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.side4 = side4;
    }

    public double getArea() {
        double p = (side1 + side2 + side3 + side4) / 2;
        double area;
        area = Math.sqrt((p - side1) * (p - side2) * (p - side3) * (p - side4));
        return area;
    }

    public double getPerimeter() {
        double perimeter;
        perimeter = side1 + side2 + side3 + side4;
        return perimeter;
    }

}