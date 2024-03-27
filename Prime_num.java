import java.util.Scanner;
public class Prime_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the ranges :");
        int a =  sc.nextInt();
        int b = sc.nextInt();
        for(int i=a;i<=b;i++){
            if(CheckPrime(i)){
                System.out.print(i+" ");
            }
        }
    }
    public static boolean CheckPrime(int num){
         // 0,1 is not prime number
        if(num<2){
            return false;
        }
        else
        {              
	 // no need to run loop till num-1 as for any number x the numbers in
    // the range(num/2 + 1, num) won't be divisible anyways. 
    // Example 36 wont be divisible by anything b/w 19-35
            int x=num/2;
            for(int i=2; i<=x;i++){
               if(num%i==0){
                   return false;
           }
             
        }
    }
    //The number would be prime if we reach here
    return true;
    }
    
}
