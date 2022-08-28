package design_patterns.creational.builder_pattern;

public class ChickenBurger extends Burger {

    @Override
    public String name() {
        return "Chicken burger";
    }

    @Override
    public float price() {
        return 50.5F;
    }
}
