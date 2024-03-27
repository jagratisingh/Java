import java.util.Scanner;
public class Hcf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n1 and n2 : ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int on1=n1;
        int on2=n2;
        while(n1%n2!=0){
             int rem=n1%n2;
             n1=n2;
             n2=rem;
        }
        int gcd = n2;
        int lcm=(on1*on2)/gcd;
        System.out.println("lcm of two numbers :"+lcm);
        System.out.println("Hcf two numbers: "+gcd);

    }
    
}
