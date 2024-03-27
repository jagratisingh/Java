import java.util.Scanner;
public class Num_digits {
    public static void main(String[] args) {
        System.out.println("Enter the integer:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count =0;
        while(num!=0){
              int rem = num%10;
              System.out.print(rem);
              count++;
              num=num/10;
        }
       
        System.out.println("The number of digits in a integer:"+ count);

    }
    
}
