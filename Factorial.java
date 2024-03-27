import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int fact = 1;
        int n= sc.nextInt();
        while(n>=1){
              fact = fact*n;
              n--;
        }
        System.out.println("factorial of a number :"+fact);
    }
    
}
