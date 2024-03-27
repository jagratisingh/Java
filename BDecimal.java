import java.util.Scanner;
public class BDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the binary number :");
        int bn = sc.nextInt();
        int ans =0;
        int pw = 1;
        while(bn!=0){
            int un  = bn%10;
            ans+= un * pw;
            bn = bn/10;
            pw *= 2;
        }
        System.out.println(ans);
    }
    
}
