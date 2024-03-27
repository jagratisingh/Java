import java.util.Scanner;
public class DBinary {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter the decimal: ");
        int dec = sc.nextInt();
        int un=0;
        while(dec!=0){
            un = dec%2;
            dec=dec/2;
            System.out.print(un);
        }
       // System.out.println("The binary number :"+un);

        
    }
    
}
