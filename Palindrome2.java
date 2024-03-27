import java.util.Scanner;
public class Palindrome2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int check=num;
        int rev=0;
        while(num!=0){
            int rem = num%10;
            rev=rev*10+rem;
            num=num/10;
               
        }
        if(check==rev){
                System.out.println("It is palindrome");
        }
        else
        {
            System.out.println("It is not palindrome");
        }
    }

    
}
