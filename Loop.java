import java.util.*;
public class Loop{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int f=1;
        for(int i=x;i<x;i++){
            f=f*i;
        }
        System.out.println("factorial is:\t"+f);
    }
}