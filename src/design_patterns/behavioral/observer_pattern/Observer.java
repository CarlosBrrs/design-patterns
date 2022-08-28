package design_patterns.behavioral.observer_pattern;

public abstract class Observer {

    protected Subject subject;
    public abstract void update();
}
