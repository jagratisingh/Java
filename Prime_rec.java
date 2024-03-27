import java.util.Scanner;
public class Prime_rec {
    public static void main(String[] args) {
        System.out.println("Enter the n:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = sc.nextInt();
        boolean check =isPrime(n,i);
        System.out.println(check);

    }
    public static boolean isPrime(int n , int i){
        //base cases
        if(n<=2){
              return (n==2)? true: false;
        }
        else if(n%i==0){
             return false;
        }
        else if(i*i>n){
             return true;
        }
        // check for next driver 
        else
        {
            return isPrime(n, i+1);
        }

    }
    
}
