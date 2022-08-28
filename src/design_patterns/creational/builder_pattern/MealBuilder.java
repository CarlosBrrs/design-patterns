package design_patterns.creational.builder_pattern;

public class MealBuilder {

    public Meal prepareVegMeal () {
        Meal meal = new Meal();
        VegBurger veg = new VegBurger();
        Coke coke = new Coke();
        meal.addItem(veg);
        meal.addItem(coke);
        System.out.println(veg.name() + " and " + coke.name() + " prepared in vegan meal");
        return meal;
    }

    public Meal prepareNonVegMeal () {
        Meal meal = new Meal();
        ChickenBurger chickenBurger = new ChickenBurger();
        Pepsi pepsi = new Pepsi();
        meal.addItem(chickenBurger);
        meal.addItem(pepsi);
        System.out.println(chickenBurger.name() + "and " + pepsi.name() + " prepared in non vegan meal");
        return meal;
    }
}
