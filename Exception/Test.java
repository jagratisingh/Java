package Exception;

public class Test {
    public static void main(String[] args) throws Exception {
        Student stu = new Student(90,13,"Jagrati");
       // stu.setAge(10);
       if(stu.getAge()>=18 && stu.getAge()<=25){
           System.out.println("will get admission");
       }
       else
       {   try{
            System.out.println("distance sol");
       }
       
       catch(Exception e){
          throw new Exception("Distance SOL");
          //main(args);
       }
       }
    }
    
}
