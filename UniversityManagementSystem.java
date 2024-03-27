import java.util.ArrayList;
import java.util.List;
// Student class
class Student {
    private String name;
    private List<Course> courses;

    public Student(int id, String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }
    public void enrollCourse(Course course) {
        courses.add(course);
        course.addStudent(this);
    }
    public void displayCourses() {
        System.out.println("Courses enrolled by " + name + ":");
        for (Course course : courses) {
            System.out.println("- " + course.getName());
        }
    }
}
// Course class
class Course {
    private String name;
    private List<Student> students;

    public Course(int courseId, String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }
    public void addStudent(Student student) {
        students.add(student);
    }
    public String getName() {
        return name;
    }
}
// University management system
public class UniversityManagementSystem {
    public static void main(String[] args) {
        // Create students
        Student student1 = new Student(1, "Shreya");
        Student student2 = new Student(2, "Shristi");
        // Create courses
        Course course1 = new Course(101, "Computer Science");
        Course course2 = new Course(102, "Mathematics");
        // Enroll students in courses
        student1.enrollCourse(course1);
        student1.enrollCourse(course2);
        student2.enrollCourse(course1);
        // Display enrolled courses for each student
        student1.displayCourses();
        student2.displayCourses();
    }
} 




