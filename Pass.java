import java.util.*;
public class Pass{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float a=sc.nextFloat();
        float b=sc.nextFloat();
        float c=sc.nextFloat();
        float marks=a+b+c;
        System.out.println(marks);
        float percentage = marks/300*100;
        System.out.println(percentage);
        if(percentage>=40){
            System.out.println("PASS");
     }
     else
         System.out.println("FAIL");
      
    }
}