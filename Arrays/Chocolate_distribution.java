package Arrays;
import java.util.Arrays;
import java.util.Scanner;
public class Chocolate_distribution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //number of elements in an array
        int n = sc.nextInt();
        //number of packets having each student
        int m = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        long result=Distribution(arr, n, m);
        System.out.println(result);
        sc.close();
    }
    public static long Distribution(int[] arr , int n , int m){
        int start=0;
        int end=m-1;
        /*Integer.MAX_VALUE is a constant defined in the Integer class, 
        representing the maximum value that can be stored in an int variable.
         It has a value of 2,147,483,647.*/
        long min_choco = Integer.MAX_VALUE;
        while(end<=n-1){
            long temp= arr[end]-arr[start];
            min_choco=Math.min(temp,min_choco);
            start++;
            end++;
        }
        return min_choco;

    }
    
}
