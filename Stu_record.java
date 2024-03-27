public class Stu_record implements Comparable<Stu_record> {
         
    private Integer rollno ;
    private String name;
    private String email;
    private String marks;
    public Stu_record(Integer rollno, String name, String email, String marks) {
        this.rollno = rollno;
        this.name = name;
        this.email = email;
        this.marks = marks;
    }
    public Integer getRollno() {
        return rollno;
    }
    public void setRollno(Integer rollno) {
        this.rollno = rollno;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getMarks() {
        return marks;
    }
    public void setMarks(String marks) {
        this.marks = marks;
    }
    @Override
    public String toString() {
        return "Stu_record [rollno=" + rollno + ", name=" + name + ", email=" + email + ", marks=" + marks + "]";
    }
    public int compareTo(Stu_record o)
    {
        return name.compareTo(o.name)<0?1:-1;
    }
    
}
