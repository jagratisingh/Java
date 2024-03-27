import java.util.*;
public class Test2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number :");
        int x=sc.nextInt();
        if(x%4==0)
           System.out.println("leap year");
        else
           System.out.println("not a leap year");   
    }
}