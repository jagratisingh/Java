package College;

public class College {
         College(){
            System.out.println("College has many properties ");
         }
         void Lists(){
            System.out.println("There are so many things in college ");
         }

    public static void main(String[] args) {
           College clg = new College();
           clg.Lists();
           Teacher teach = new Teacher();
           teach.Skills();
           Student stud = new Student(teach);
           stud.Knowledge();
           Peon P = new Peon();
           P.HardWorking();
           P.Honesty();

    }
    
}
