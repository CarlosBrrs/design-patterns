package design_patterns.creational.builder_pattern;

import java.util.ArrayList;
import java.util.List;

public class Meal {

    private List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
        System.out.println("Item: " + item.name() + " added");
    }

    public float getCost() {
        float cost = 0.0F;

        for (Item item : items) {
            cost += item.price();
        }
        return cost;
    }

    public void showItems() {
        for (Item item : items) {
            System.out.print("Item: " + item.name());
            System.out.print(", packing: " + item.packing().pack());
            System.out.println(", price: " + item.price());
        }
    }
}
