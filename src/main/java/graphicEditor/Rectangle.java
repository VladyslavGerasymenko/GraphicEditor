package graphicEditor;

public class Rectangle extends Shape {
    private final double width;
    private final double height;

    public Rectangle(double width, double height) {
        super("Rectangle");
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        double area;
        area = width * height;
        return area;
    }

    public double getPerimeter() {
        double perimeter;
        perimeter = 2 * (width + height);
        return perimeter;
    }
}

