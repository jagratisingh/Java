import java.util.Scanner;
public class Permutations {
    public static void main(String[] args) {
        System.out.println("Enter the num of people n and r seats: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        Factorial(n, r);
    }
    public static void Factorial(int n , int r){
          int a = n-r;
          int fact=1;
          int ft=1;
          int per;
          //calculating factorial (n!)
          while(n!=1){
              fact=n*fact;
              n--;
          }
          //calculating factorial ((n-r)!)
          if(a>0){
          while(a!=1){
              ft=a*ft;
              a--;
          }
         } 
       /*   if(a<0){
            System.out.println("r is greater than n");
         } */

          //calculating npr
          per=fact/ft;
          System.out.println("Permutation for n people and their r seats:"+per);

    }
    
}
