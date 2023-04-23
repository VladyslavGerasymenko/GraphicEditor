package GraphicEditor;

public class ShapeNames {
    public static void printShapeName(Shape shape) {
        if (shape instanceof Circle) {
            System.out.println("Circle");
        } else if (shape instanceof Rectangle) {
            System.out.println("Rectangle");
        } else if (shape instanceof Triangle) {
            System.out.println("Triangle");
        } else if (shape instanceof Pentagon) {
            System.out.println("Pentagon");
        } else if (shape instanceof Hexagon) {
            System.out.println("Hexagon");
        } else if (shape instanceof Octagon) {
            System.out.println("Octagon");
        } else if (shape instanceof Rhombus) {
            System.out.println("Rhombus");
        } else if (shape instanceof Parallelogram) {
            System.out.println("Parallelogram");
        } else if (shape instanceof Trapezium) {
            System.out.println("Trapezium");
        } else if (shape instanceof Decagon) {
            System.out.println("Decagon");
        } else if (shape instanceof Quad) {
            System.out.println("Quad");
        } else {
            System.out.println("Unknown shape");
        }
    }
}
