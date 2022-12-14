package design_patterns.structural.filter_pattern;

import java.util.List;
import java.util.stream.Collectors;

public class CriteriaFemale implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {

        return persons.stream()
                .filter(person -> person.getGender().equalsIgnoreCase("FEMALE"))
                .collect(Collectors.toList());
    }
}
