import java.util.Scanner;
public class EOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n :");
        int n = sc.nextInt();
        String str   = n%2==0 ? "even": "odd";
        System.out.println(str);
    }
    
}
