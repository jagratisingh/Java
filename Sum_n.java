import java.util.Scanner;
public class Sum_n{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter n :");
        int n = sc.nextInt();
        int total = Sum(n);
        System.out.println("Total:"+total);
        
    }
    public static int Sum(int n)
    {
        if(n==0){
              return n;
        }
        else
        {
            return n + Sum(n-1);
        }
    }
    
}
