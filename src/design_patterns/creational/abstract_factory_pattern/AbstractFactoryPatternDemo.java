package design_patterns.creational.abstract_factory_pattern;

/**
 * Abstract Factory patterns work around a super-factory which creates other factories. This factory is also called as
 * factory of factories. This type of design pattern comes under creational pattern as this pattern provides one of the
 * best ways to create an object.
 *
 * In Abstract Factory pattern an interface is responsible for creating a factory of related objects without explicitly
 * specifying their classes. Each generated factory can give the objects as per the Factory pattern.
 */
public class AbstractFactoryPatternDemo {

    public static void main(String[] args) {

        //get shape factory
        AbstractFactory roundedShapeFactory = FactoryProducer.getFactory(true);

        //get an object of Shape Rectangle
        Shape roundedRectangle = roundedShapeFactory.getShape("RECTANGLE");

        //call draw method of Shape Rectangle
        roundedRectangle.draw();

        //get an object of Shape Square
        Shape roundedSquare = roundedShapeFactory.getShape("SQUARE");

        //call draw method of Shape Square
        roundedSquare.draw();

        //get shape factory
        AbstractFactory shapeFactory = FactoryProducer.getFactory(false);

        //get an object of Shape Rectangle
        Shape rectangle = shapeFactory.getShape("RECTANGLE");

        //call draw method of Shape Rectangle
        rectangle.draw();

        //get an object of Shape Square
        Shape square = shapeFactory.getShape("SQUARE");

        //call draw method of Shape Square
        square.draw();
    }
}
