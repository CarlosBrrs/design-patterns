package design_patterns.creational.abstract_factory_pattern;

public class RoundedSquare implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside " + this.getClass().getSimpleName() + "::draw() method...");
    }
}
