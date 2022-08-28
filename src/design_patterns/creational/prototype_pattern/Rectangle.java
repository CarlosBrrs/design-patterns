package design_patterns.creational.prototype_pattern;

public class Rectangle extends Shape {

    public Rectangle() {
        type = "Rectangle";
    }

    @Override
    void draw() {
        System.out.println("Inside " + this.getClass().getSimpleName() + "::draw() method...");
    }
}
