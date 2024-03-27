import java.util.Scanner;
public class Strong_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = sc.nextInt();
        int rem ;
        int fact=1;
        int sum=0;
        while(num!=0){
            rem =num%10;
            while(rem>=1){
                 fact = fact*rem;
                  
            }
             rem--;
            System.out.println("Facotrial of each digit :"+fact);
            sum+=fact;

              
        }
        System.out.println("The sum :"+sum);

        
    }
    
}
