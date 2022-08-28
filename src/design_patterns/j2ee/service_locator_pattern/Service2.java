package design_patterns.j2ee.service_locator_pattern;

public class Service2 implements Service {

    public void execute(){
        System.out.println("Executing " + this.getClass().getSimpleName());
    }

    @Override
    public String getName() {
        return this.getClass().getSimpleName();
    }
}
