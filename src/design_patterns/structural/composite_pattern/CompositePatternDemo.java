package design_patterns.structural.composite_pattern;

/**
 * Composite pattern is used where we need to treat a group of objects in similar way as a single object. Composite
 * pattern composes objects in term of a tree structure to represent part as well as whole hierarchy. This type of
 * design pattern comes under structural pattern as this pattern creates a tree structure of group of objects.
 *
 * This pattern creates a class that contains group of its own objects. This class provides ways to modify its group of
 * same objects.
 *
 * We are demonstrating use of composite pattern via following example in which we will show employees hierarchy of an
 * organization.
 */
public class CompositePatternDemo {

    public static void main(String[] args) {

        Employee CEO = new Employee("John","CEO", 30000);

        Employee headSales1 = new Employee("Robert","Head Sales", 20000);

        Employee headMarketing1 = new Employee("Michel","Head Marketing", 20000);

        Employee clerk1 = new Employee("Laura","Marketing", 10000);
        Employee clerk2 = new Employee("Bob","Marketing", 10000);

        Employee salesExecutive1 = new Employee("Richard","Sales", 10000);
        Employee salesExecutive2 = new Employee("Rob","Sales", 10000);

        CEO.addToSubordinates(headSales1);
        CEO.addToSubordinates(headMarketing1);

        headSales1.addToSubordinates(salesExecutive1);
        headSales1.addToSubordinates(salesExecutive2);

        headMarketing1.addToSubordinates(clerk1);
        headMarketing1.addToSubordinates(clerk2);

        //print all employees of the organization
        System.out.println(CEO);

        CEO.getSubordinates().forEach(headEmployee -> {
            System.out.println(headEmployee);
            headEmployee.getSubordinates().forEach(System.out::println);
        });
    }
}
