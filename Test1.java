import java.util.*;
public class Test1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number :");
        int x=sc.nextInt();
        String y=(x>0)?"positive":"negative";
        System.out.println(y);
    }
}