package design_patterns.structural.facade_pattern;

public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println(this.getClass().getSimpleName() + "::draw()");
    }
}
