package model;

public class Student extends Person {
    private int rollNo;
    private String course;
    private double marks;
    private String grade;

    // Constructor
    public Student(int rollNo, String name, String email, String course, double marks, String grade) {
        super(name, email);
        this.rollNo = rollNo;
        this.course = course;
        this.marks = marks;
        this.grade = grade;
    }

    // Overriding abstract method
    @Override
    public void displayInfo() {
        System.out.println("Student Info:");
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Course: " + course);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + grade);
        System.out.println();
    }

    // Overloaded method
    public void displayInfo(boolean showGrade) {
        System.out.println("Student Info (Overloaded):");
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        if (showGrade)
            System.out.println("Grade: " + grade);
        System.out.println();
    }

    // Getters
    public int getRollNo() { return rollNo; }
    public String getName() { return name; }
    public String getEmail() { return email; }
    public String getCourse() { return course; }
}
