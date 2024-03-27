package Exception;
import java.util.*;
public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the inputs :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        //System.out.println(a/b);
        //try we use for correct input
        try{ 
            System.out.println(a/b);
        }
        //if there is any exception then we send into catch for handling
        catch(Exception e){
            System.out.println(e.getMessage());
            main(args);//ask until you enter the correct value 

        }

    }
    
}
