import java.net.Inet4Address;
import java.util.*;
public class Rectangular {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n :");
        int n =sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j++){
                System.out.print(j);
            }
            for(int k=1;k<=i-1;k++){
                 System.out.print(k);
            }
           // System.out.print(i);
            System.out.println();
        }
    }
    
}
