import model.Student;
import service.StudentManager;

public class Main {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();

        Student s1 = new Student(101, "Ankit", "ankit@mail.com", "B.Tech", 85.6, "A");
        Student s2 = new Student(102, "Riya", "riya@mail.com", "M.Tech", 91.2, "A+");

        manager.addStudent(s1);
        manager.addStudent(s2);

        manager.viewAllStudents();

        System.out.println("Searching Student with Roll No 101:");
        Student found = manager.searchStudent(101);
        if (found != null) found.displayInfo(false);

        manager.deleteStudent(102);
        manager.viewAllStudents();
    }
}
