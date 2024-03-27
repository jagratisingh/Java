import java.util.Scanner;
import java.lang.Math;
public class Bin_Dec {
    public static void main(String[] args) {
        System.out.println("Enter the n :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Convert(n);
        
    }
    public static void Convert(int n){
       double sum=0;
        int i=0;
        while(n!=0){
          int rem=n%10;
          double dec = (Math.pow(2,i));
          i=i+1;
          double mul = dec*rem;
          sum=sum+mul;
          n=n/10;      
       }
       System.out.println("Binary to decimal conversion:"+sum);
    }
   
    
}
