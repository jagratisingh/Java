package Arrays;
import java.util.Arrays;
import java.util.Scanner;
public class Minimize_heights {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //k is value you can add or subtract 
        //but the case is height should not be negative
        int k = sc.nextInt();
        //creating an array to store the elements
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();        
        }
        int result=minimize(arr, n, k);
        System.out.println(result);
        sc.close();
    }
    //minimize the maximum difference between heights
    public static int minimize(int[] arr,int n, int k){
        if(n==1){
            return 1;
        }
        Arrays.sort(arr);
        //this will be always maximum difference
        int diff = arr[n-1]- arr[0];
        for(int i=0;i<n;i++){
        if(arr[i]-k<0){
            continue;
        }
        int max=Math.max(arr[i-1]+k,arr[n-1]+k);
        int min=Math.min(arr[0]+k,arr[i]-k);
        diff=Math.min(max,min);
    }
    return diff;
    }
    
}
