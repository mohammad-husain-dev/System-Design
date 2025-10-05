package GeometricShapes;

import GeometricShapes.Shapes.Circle;
import GeometricShapes.Shapes.Rectangle;
import GeometricShapes.Shapes.Shape;
import GeometricShapes.Shapes.Triangle;

public class ShapeFactory {

    public static Shape createShape(String shapeType){
        Shape shape = null;

        switch (shapeType){
            case "Circle":
                shape = new Circle();
                break;
            case "Rectangle":
                shape = new Rectangle();
                break;
            case "Triangle":
                shape = new Triangle();
                break;
            default:
                break;
        }

        return shape;
    }
}
