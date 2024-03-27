import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input :");
        int num = sc.nextInt();
        int rem ;
        int sum=0;
        while(num!=0){
            rem=num%10;
            sum+=Math.pow(rem,3);
            num=num/10;    
        }
        System.out.println("num and sum :"+num +" "+sum);
    }


    
}
