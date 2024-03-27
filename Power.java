import java.util.Scanner;
public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = (int) Math.pow(2,n);
        int res1 = (int)Math.pow(3,n);
        System.out.println(res+" "+res1);
        
    }
    
}
