package design_patterns.j2ee.composite_entity_pattern;

import java.util.Arrays;

public class Client {

    private CompositeEntity compositeEntity = new CompositeEntity();

    public void printData(){

        Arrays.stream(compositeEntity.getData()).map(s -> "Data: " + s).forEach(System.out::println);
    }

    public void setData(String data1, String data2){
        compositeEntity.setData(data1, data2);
    }
}
