//Can we expressed a number as a sum of two prime numbers 
import java.util.Scanner;
public class Sum_prime {
    public static void main(String[] args) {
        //Scanner class declaration
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num:");
        //input for user
        int num = sc.nextInt();
        int x =0;
        for(int i=2;i<=num/2;i++){
            if(prime_or_not(i)==1){
                if(prime_or_not(num-i)==1){
                     System.out.println(num+"="+i+"+"+(num-i));
                     x=1;
                }
            }
        }
        if(x==0){
            System.out.println(+num+"Cannot be expressed as a sum of two prime numbers");
        }
    }   
        //function for checking number is prime or not
        public static int prime_or_not(int n){
            int c=1;//flag value
            for(int i=2;i<n;i++){
                 if(n%i==0){
                      c=0;
                      break;
                 }
            }
            return c;
    }
}
