import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
// Class to represent a Student
class Student {
    private String name;
    private int roll;
    private int yearOfAdmission;
    private String gender;
    public Student(String name, int roll, int yearOfAdmission, String gender) {
        this.name = name;
        this.roll = roll;
        this.yearOfAdmission = yearOfAdmission;
        this.gender = gender;
    }
    // Getters for student details
    public String getName() {
        return name;
    }
    public int getRoll() {
        return roll;
    }
    public int getYearOfAdmission() {
        return yearOfAdmission;
    }
    public String getGender() {
        return gender;
    }
}
// Class to represent a College
class College {
    private String name;
    private List<Student> students;
    public College(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }
    // Register a new student to the college
    public void registerStudent(Student student) {
        students.add(student);
    }
    // Count of students in the college
    public int getStudentCount() {
        return students.size();
    }
    // Search student by roll number
    public Student searchStudentByRoll(int rollNumber) {
        for (Student student : students) {
            if (student.getRoll() == rollNumber) {
                return student;
            }
        }
        return null; // Student not found
    }
    // Get year-wise count of students
    public Map<Integer, Integer> getYearWiseStudentCount() {
        Map<Integer, Integer> yearWiseCount = new HashMap<>();
        for (Student student : students) {
            int year = student.getYearOfAdmission();
            yearWiseCount.put(year, yearWiseCount.getOrDefault(year, 0) + 1);
        }
        return yearWiseCount;
    }
    public String getName() {
        return null;
    }
}

public class UniversityRegistrationSystem {
    public static void main(String[] args) {
        // Example usage:
        College college = new College("ABC University");
        college.registerStudent(new Student("Alice", 101, 2021, "Female"));
        college.registerStudent(new Student("Bob", 102, 2020, "Male"));
        college.registerStudent(new Student("Charlie", 103, 2021, "Male"));

        // Display student count in the college
        System.out.println("Total Students in " + college.getName() + ": " + college.getStudentCount());

        // Search student by roll number
        int rollToSearch = 102;
        Student searchedStudent = college.searchStudentByRoll(rollToSearch);
        if (searchedStudent != null) {
            System.out.println("Student found - Name: " + searchedStudent.getName() +
                                ", Year of Admission: " + searchedStudent.getYearOfAdmission());
        } else {
            System.out.println("Student with roll number " + rollToSearch + " not found.");
        }

        // Year-wise count of students in the college
        Map<Integer, Integer> yearWiseCount = college.getYearWiseStudentCount();
        System.out.println("Year-wise count of students:");
        for (Map.Entry<Integer, Integer> entry : yearWiseCount.entrySet()) {
            System.out.println("Year " + entry.getKey() + ": " + entry.getValue() + " students");
        }
    }
}

     
