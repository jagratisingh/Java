import java.util.*;
public class Test5{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int x=sc.nextInt();
        if(x<0)
        System.out.println("ice");
        else if(x>0 && x<100)
        System.out.println("water");
        else
        System.out.println("steam");
    }
}