package Filehandling2;
import java.util.Arrays;
import java.io.Serializable;

//Student Data

public class Data implements Serializable{
   private int sno;
   private Name uname;
   private String email;
   private Address address;
   private String[] subjects;
   private float marks;
   public int getSno() {
   return sno;
   }
   public void setSno(int sno) {
     this.sno = sno;
}
public Name getUname() {
    return uname;
}
public void setUname(Name uname) {
    this.uname = uname;
}
public String getEmail() {
    return email;
}
public void setEmail(String email) {
    this.email = email;
}
public Address getAddress() {
    return address;
}
public void setAddress(Address address) {
    this.address = address;
}
public String[] getSubjects() {
    return subjects;
}
public void setSubjects(String[] subjects) {
    this.subjects = subjects;
}
public float getMarks() {
    return marks;
}
public void setMarks(float marks) {
    this.marks = marks;
}
public Data(int sno, Name uname, String email, Address address, String[] subjects, float marks) {
    this.sno = sno;
    this.uname = uname;
    this.email = email;
    this.address = address;
    this.subjects = subjects;
    this.marks = marks;
}
@Override
public String toString() {
    return "Data [sno=" + sno + ", uname=" + uname + ", email=" + email + ", address=" + address + ", subjects="
            + Arrays.toString(subjects) + ", marks=" + marks + "]";
}



}