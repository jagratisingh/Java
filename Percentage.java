import java.util.*;
public class Percentage{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        float marks;
        float percentage;
        float s1,s2,s3,s4,s5;
        System.out.println("Enter first sub marks :");
        s1=sc.nextFloat();
        System.out.println("Enter second sub marks :");
        s2=sc.nextFloat();
        System.out.println("Enter third sub marks :");
        s3=sc.nextFloat();
        System.out.println("Enter fourth sub marks :");
        s4=sc.nextFloat();
        System.out.println("Enter fifth sub marks :");
        s5=sc.nextFloat();
        marks=s1+s2+s3+s4+s5;
        System.out.println("marks is :" +marks);
        percentage=marks/500*100;
        System.out.println("percentage is :" +percentage);
    }
    }