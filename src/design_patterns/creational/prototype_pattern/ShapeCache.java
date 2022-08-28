package design_patterns.creational.prototype_pattern;

import java.util.Hashtable;

public class ShapeCache {

    private static Hashtable<String, Shape> shapeHashtable = new Hashtable<>();

    public static Shape getShape(String shapeId) {
        Shape cachedShape = shapeHashtable.get(shapeId);
        return (Shape) cachedShape.clone();
    }

    /**
     * for each shape run database query and create shape
     * shapeMap.put(shapeKey, shape);
     * for example, we are adding three shapes
     */

    public static void loadCache() {
        Circle circle = new Circle();
        circle.setId("1");
        shapeHashtable.put(circle.getId(), circle);

        Square square = new Square();
        square.setId("2");
        shapeHashtable.put(square.getId(), square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        shapeHashtable.put(rectangle.getId(), rectangle);
    }
}
