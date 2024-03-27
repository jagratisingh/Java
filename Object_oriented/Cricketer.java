package Object_oriented;

public class Cricketer {

 String name;
 String team;
 int age;
 Cricketer ()   //default constructor.
 {
    name ="";
    team ="";
     age = 0;
 }
 Cricketer(String n, String t, int a)   //constructor overloaded
 {
    name = n;
    team = t;
    age = a;
 }
 Cricketer (Cricketer ckt)     //constructor similar to copy constructor of c++ 
 {
    name = ckt.name;
    team = ckt.team;
    age = ckt.age;
 }
 //The toString() method returns the String representation of the object.
 //if we don't use it than it will not print as we want 
 public String toString()
 {
     return "this is " + name + " of "+team;
 }
 public static void main (String[] args)
 {
  Cricketer c1 = new Cricketer();
  Cricketer c2 = new Cricketer("sachin", "India", 32);
  Cricketer c3 = new Cricketer(c2 );
  System.out.println(c2);//compiler writes here c2.toString()
  System.out.println(c3);
  c1.name = "Virat";
  c1.team= "India";
  c1.age = 32;
  System.out.println(c1);
 }
}
    