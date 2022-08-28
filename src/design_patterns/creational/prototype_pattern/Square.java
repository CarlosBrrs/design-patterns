package design_patterns.creational.prototype_pattern;

public class Square extends Shape {

    public Square() {
        type = "Square";
    }

    @Override
    void draw() {
        System.out.println("Inside " + this.getClass().getSimpleName() + "::draw() method...");
    }
}
