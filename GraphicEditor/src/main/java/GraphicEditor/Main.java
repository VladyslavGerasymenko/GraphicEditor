package GraphicEditor;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(10, 20);
        Triangle triangle = new Triangle(3, 4, 5);
        Pentagon pentagon = new Pentagon(5);
        Hexagon hexagon = new Hexagon(5);
        Octagon octagon = new Octagon(5);
        Rhombus rhombus = new Rhombus(5, 60);
        Parallelogram parallelogram = new Parallelogram(10, 5, 60);
        Trapezium trapezium = new Trapezium(10, 5, 4, 6, 60);
        Decagon decagon = new Decagon(5);
        Quad quad = new Quad(4, 8, 4, 8);

        ShapeNames.printShapeName(circle);
        ShapeNames.printShapeName(rectangle);
        ShapeNames.printShapeName(triangle);
        ShapeNames.printShapeName(pentagon);
        ShapeNames.printShapeName(hexagon);
        ShapeNames.printShapeName(octagon);
        ShapeNames.printShapeName(rhombus);
        ShapeNames.printShapeName(parallelogram);
        ShapeNames.printShapeName(trapezium);
        ShapeNames.printShapeName(decagon);
        ShapeNames.printShapeName(quad);
    }

}

