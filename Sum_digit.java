import java.util.Scanner;
public class Sum_digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int num = sc.nextInt();
       // int rem;
        int sum=0;
        /* while(num!=0){
              // rem = num%10;
               //System.out.println(rem);
                sum=sum+num%10;
              // System.out.println(sum);
               num=num/10;
        }
        System.out.println("The sum of digits of a number:"+sum);
         */
        int result = getSum(num, sum);
        System.out.println(result);
    }
    public static int getSum(int num , int sum){
        if(num==0){
            return sum;
        }
        sum+=num%10;
        return getSum(num/10, sum);
    }
    
}
