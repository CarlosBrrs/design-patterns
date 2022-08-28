package design_patterns.creational.builder_pattern;

public class VegBurger extends Burger {

    @Override
    public String name() {
        return "Vegan burger";
    }

    @Override
    public float price() {
        return 25.0F;
    }
}
