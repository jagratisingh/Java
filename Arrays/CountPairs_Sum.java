package Arrays;
import java.util.Scanner;
public class CountPairs_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //k : represents the sum of pairs
        int k = sc.nextInt();
        //creating an array to store the elements
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
          arr[i]=sc.nextInt();
        }
        int output = Pairs_Sum(arr, n, k);
        System.out.println(output);
        sc.close();

    }
    public static int Pairs_Sum(int[] arr , int n , int k){
          int count=0;
          for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==k)
                {
                   count++;
                }
            }
          }
          return count;
    }
    
}
