package Object_oriented;

public class Basic {
    // instance variabls:It gets memory when an object is created at runtime.
      String name;
      int roll_no;
      int marks;
      //methods: used to perform operations and represent behavior of an object.
          void info(){
          System.out.println("student name:"+name);
          System.out.println("roll_no:"+roll_no);
          System.out.println("Marks :"+marks); 


      }
      public static void main(String[] args) {
       //variable_name>reference variable>hold the reference of created object.
       //The new :keyword :allocate memory for the object.
       //bs : variable > that represents the class runtime
          Basic bc = new Basic();
          // Accessing and property value
          bc.name = "Jagrati";
          bc.roll_no=29;
          bc.marks=67;
          //calling the method
          bc.info();

      }


    }
