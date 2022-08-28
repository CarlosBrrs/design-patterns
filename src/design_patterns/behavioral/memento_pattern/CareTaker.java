package design_patterns.behavioral.memento_pattern;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {

    private List<Memento> mementoList = new ArrayList<>();

    public void addMementoState(Memento state){
        mementoList.add(state);
    }

    public Memento getMemento(int index){
        return mementoList.get(index);
    }
}
