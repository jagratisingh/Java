import java.util.Scanner;
public class occ_digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        System.out.println("Enter the digit for occurence:");
        int digit = sc.nextInt();
        int count=0;
        while(num!=0){
              int rem = num%10;
              if(digit==rem){
                 count++;
              }
              num=num/10;

        }
        System.out.println("The occurence of a digit :"+count);

        
    }
    
}
