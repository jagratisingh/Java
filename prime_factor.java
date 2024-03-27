import java.util.Scanner;
public class prime_factor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num:");
        int num = sc.nextInt();
        for(int i=1;i<num;i++){
             if(num%i==0){
                  System.out.println("factors of a num :"+i);
                  if(i%i==0&&i%1==0){
                       System.out.println("prime factors of a num :"+i);
                  }
             }
        }
        
    }
}
