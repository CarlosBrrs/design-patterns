package design_patterns.creational.builder_pattern;

public class Coke extends ColdDrink {

    @Override
    public String name() {
        return "Diet coke";
    }

    @Override
    public float price() {
        return 30.0F;
    }
}
