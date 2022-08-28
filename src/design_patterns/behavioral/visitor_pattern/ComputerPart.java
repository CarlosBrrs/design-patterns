package design_patterns.behavioral.visitor_pattern;

public interface ComputerPart {

    void accept(ComputerPartVisitor computerPartVisitor);
}
