package service;

import model.Student;
import java.util.List;

public interface RecordActions {
    void addStudent(Student student);
    void deleteStudent(int rollNo);
    void updateStudent(int rollNo, Student newStudent);
    Student searchStudent(int rollNo);
    void viewAllStudents();
}
