import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isPrime = true;
        if(n<2){
            isPrime=false;
        }
        else
        { 
            for(int i=2;i<n/2;i++){
                  if(n%i==0){
                       isPrime=false;
                       break;
                  }
            }
        }
        String result = isPrime? "Prime": "not prime";
        System.out.println(n+" "+result);
    }
}
