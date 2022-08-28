package design_patterns.structural.filter_pattern;

import java.util.List;

public interface Criteria {

    List<Person> meetCriteria(List<Person> persons);
}
