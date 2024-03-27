import java.util.Scanner;
public class Prime_fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //read the value from stdin
        System.out.println("Enter the nth term :");
        int n =sc.nextInt();
        //find the nth term in the series
        int nthTerm = findNthterm(n);
        //Print that nth term
        System.out.println(nthTerm);
        sc.close();
        
    }
    public static int fibonacci(int n){
        //fibonacci series generator
        int a=1;
        int b=1;
        if(n==1||n==2){
            return 1;
        }
        for(int i=3;i<=n;i++){
            int c=a+b;
            a=b;
            b=c;
        }
        return b;
    }
    //check if a number is prime or not
    public static boolean isPrime(int num){
        if(num<=1){
            return false;
        }
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
    //find the nth term
    public static int findNthterm(int n) {
        if(n%2==1){
            //odd term , Calculate fibonacci series
            return fibonacci((n+1)/2);
        }
        else
        {
            //even term , calculate prime numbers
            int primeCount=0;
            int i=2;
            while(primeCount<n/2){
                if(isPrime(i)){
                    primeCount++;
                }
                i++;
            }
            return i-1;
        }
    
        
    }

}
