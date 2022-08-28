package design_patterns.creational.abstract_factory_pattern;

public class ShapeFactory extends AbstractFactory {

    @Override
    Shape getShape(String shapeType) {

        if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        }

        if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }

        return null;
    }
}
