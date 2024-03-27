import java.util.Scanner;
public class Reverse_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
       // Reverse(n);
        int rev=0;
        while(n!=0){
               int rem = n%10;
               rev = rev*10+rem;
               n=n/10;
          }
          System.out.print("The reverse of digits :"+rev);

    }
  
    
}
