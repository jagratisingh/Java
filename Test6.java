import java.util.*;
public class Test6{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number :");
        int x=sc.nextInt();
        System.out.println("Enter a number :");
        int y=sc.nextInt();
        System.out.println("Enter a operator :");
        String P=sc.next();
        switch(P)
        {
              case"+":
                 System.out.println(x+y);
                 break;
              case"-":
                 System.out.println(x-y);
                 break;
              case"*":
                 System.out.println(x*y);
                 break;
              case"/":
                 System.out.println(x/y); 
                 break; 
        }
    }
}