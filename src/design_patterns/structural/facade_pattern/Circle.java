package design_patterns.structural.facade_pattern;

public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println(this.getClass().getSimpleName() + "::draw()");
    }
}
