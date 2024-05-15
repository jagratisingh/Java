package Arrays;
import java.util.Scanner;
public class MaxProductSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int largest=ProductSubarray(arr);
        System.out.println(largest);
        sc.close();
    }
    public static int ProductSubarray(int[] arr){
        if(arr==null || arr.length==0){
             return 0;
        }
        int maxSoFar=arr[0];
        int minSoFar=arr[0];
        int result=maxSoFar;
        for(int i=1;i<arr.length;i++){
            int currMax=Math.max(Math.max(maxSoFar*arr[i],minSoFar*arr[i]),arr[i]);
            minSoFar=Math.min(Math.min(maxSoFar*arr[i],minSoFar*arr[i]),arr[i]);
            maxSoFar=currMax;
            result=Math.max(maxSoFar,result);
        }
        return result;
    }
    
}
