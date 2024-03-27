import java.util.Arrays;
public class School {
    public static void main(String[] args) {
        Stu_record sr = new Stu_record(29, "Jagrati", "jagratish26@gmail.com", 50);
        System.out.println(sr);
        sr.setMarks(89.34f);
        sr.setEmail("kush29@gmail.com");
        System.out.println(sr.getEmail());
        System.out.println(sr.getMarks());
        
        Stu_record sr1 = new Stu_record(29, "Jagrati", "jagratish26@gmail.com", 50);  
        Stu_record sr2 = new Stu_record(29, "Jagrati", "jagratish26@gmail.com", 50);
        Stu_record[] str = (sr,sr1,sr2);
        for String i : str 
    }
    
}
