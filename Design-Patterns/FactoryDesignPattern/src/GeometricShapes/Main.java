package GeometricShapes;

import GeometricShapes.Shapes.Shape;

public class Main {
    public static void main(String[] args) {

        Shape shape=ShapeFactory.createShape("Circle");
        shape.draw();
    }
}