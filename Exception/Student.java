package Exception;

public class Student {
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getMarks() {
        return marks;
    }
    public void setMarks(int marks) {
        this.marks = marks;
    }
    private int age;
    private int marks;
    public Student(int marks, int age , String name){
      this.marks= marks;
      this.name = name;
      this.age=age;
    }
    
}
