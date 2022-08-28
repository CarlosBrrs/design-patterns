package design_patterns.j2ee.data_access_object_pattern;

public class Student {

    private int rollNo;
    private String name;

    public Student(String name, int rollNo) {
        this.rollNo = rollNo;
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
