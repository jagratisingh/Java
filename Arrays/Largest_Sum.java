package Arrays;
import java.util.Scanner;
public class Largest_Sum {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //creating an array to store the elements
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();        
        }
        int result=Subarray(arr, n);
        System.out.println(result);
        sc.close();
     }
     public static int Subarray(int[] arr, int n){
        int maxSum=0;
        int curSum=0;
        for(int i=0;i<arr.length;i++){
            curSum+=arr[i];
            if(curSum>maxSum){
                maxSum=curSum;
            }
            //if current sum is negative
            if(curSum<0){
               curSum=0;
            }
        }
        return maxSum;
     }
}
