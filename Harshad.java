import java.util.Scanner;
public class Harshad {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the number :");
         int num = sc.nextInt();
         int c = num;
         int sum=0;
         while(num!=0){
             int rem=num%10;
             sum=sum+rem;
             num=num/10;
         }
         //System.out.println(sum);
         if(c%sum==0){
              System.out.println("Harshad number");
         }
         else
         {
             System.out.println("This is not harshad number");
         }
    }
}
