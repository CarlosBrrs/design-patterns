package design_patterns.j2ee.data_access_object_pattern;

import java.util.List;

public interface StudentDao {

    List<Student> getAllStudents();
    Student getStudent(int rollNo);
    void updateStudent(Student student);
    void deleteStudent(Student student);
}
