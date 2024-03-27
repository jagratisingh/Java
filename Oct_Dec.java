import java.util.Scanner;
//import java.lang.Math;
public class Oct_Dec {
    public static void main(String[] args) {
        System.out.println("Enter the n:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Convert(n);
        
    }
    public static void Convert(int n){
        int i=0;
        double sum =0;
        while(n!=0){
              int rem=n%10;
              double dec = (Math.pow(8,i));
              i+=1;
              double mul= dec*rem;
              sum+=mul;
              n=n/10;
        }
        System.out.println("Octal to Binary conversion:"+sum);
        
    }
}
