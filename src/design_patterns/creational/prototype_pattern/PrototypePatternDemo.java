package design_patterns.creational.prototype_pattern;

/**
 * Prototype pattern refers to creating duplicate object while keeping performance in mind. This type of design pattern
 * comes under creational pattern as this pattern provides one of the best ways to create an object.
 *
 * This pattern involves implementing a prototype interface which tells to create a clone of the current object. This
 * pattern is used when creation of object directly is costly. For example, an object is to be created after a costly
 * database operation. We can cache the object, returns its clone on next request and update the database as and when
 * needed thus reducing database calls.
 */
public class PrototypePatternDemo {

    public static void main(String[] args) {

        ShapeCache.loadCache();

        Shape clonedShapeCircle = ShapeCache.getShape("1");
        System.out.println("Shape : " + clonedShapeCircle.getType());

        Shape clonedShapeSquare = ShapeCache.getShape("2");
        System.out.println("Shape : " + clonedShapeSquare.getType());

        Shape clonedShapeRectangle = ShapeCache.getShape("3");
        System.out.println("Shape : " + clonedShapeRectangle.getType());
    }
}
