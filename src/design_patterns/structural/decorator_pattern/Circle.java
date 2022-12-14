package design_patterns.structural.decorator_pattern;

public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Shape: " + this.getClass().getSimpleName());
    }
}
