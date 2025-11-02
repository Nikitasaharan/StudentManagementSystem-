package service;

import model.Student;
import java.util.*;

public class StudentManager implements RecordActions {
    private Map<Integer, Student> studentMap = new HashMap<>();

    @Override
    public void addStudent(Student student) {
        if (studentMap.containsKey(student.getRollNo())) {
            System.out.println("Duplicate roll number! Student not added.\n");
        } else {
            studentMap.put(student.getRollNo(), student);
            System.out.println("Student added successfully.\n");
        }
    }

    @Override
    public void deleteStudent(int rollNo) {
        if (studentMap.remove(rollNo) != null)
            System.out.println("Student deleted successfully.\n");
        else
            System.out.println("Student not found.\n");
    }

    @Override
    public void updateStudent(int rollNo, Student newStudent) {
        if (studentMap.containsKey(rollNo)) {
            studentMap.put(rollNo, newStudent);
            System.out.println("Student updated successfully.\n");
        } else {
            System.out.println("Student not found.\n");
        }
    }

    @Override
    public Student searchStudent(int rollNo) {
        return studentMap.get(rollNo);
    }

    @Override
    public void viewAllStudents() {
        if (studentMap.isEmpty()) {
            System.out.println("No students available.\n");
            return;
        }
        for (Student s : studentMap.values()) {
            s.displayInfo();
        }
    }
}
