package Library;

public class Student {
    String name;
    int age ;
    int rollno;
    Student(String n , int a , int r){
        this.name = n;
        this.age=a;
        this.rollno = r;
    }
    public static void main(String[] args) {
        Student stu = new Student("Jagrati",20,29);
        System.out.println(stu.name +" "+stu.age+" "+stu.rollno);
        Book bk = new Book("Java", 300);
        System.out.println(bk.b_name+" "+bk.price);
        L_staff staff = new L_staff("Deepak Sir ",30);
        System.out.println(staff.S_name+" "+staff.record); 
       
       // System.out.println(staff.b_name);
        
       
    }
    
}
