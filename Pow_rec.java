import java.util.Scanner;
public class Pow_rec {
    public static void main(String[] args) {
        System.out.println("Enter the base and power:");
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        int x = sc.nextInt();
        System.out.println(Power(base,x));
    }
    public static int Power(int base , int x){
        //base condition
         if(x==0){
            return 1;
         }
         return (base*Power(base,x-1));
    }
}
