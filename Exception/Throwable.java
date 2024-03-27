package Exception;
import java.util.*;
public class Throwable  {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name:");
        String name = sc.nextLine();
        int age = sc.nextInt();
        if(age>=18){
            System.out.println("can vote");
        }
        else
        {
            try{
                throw new Exception("can't vote");
            }
            catch(Exception e){
                System.out.println(e.getMessage());
                main(args);
            }
        }
    }
    
}
///E:\java\Exception\Throwable.java