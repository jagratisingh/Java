package Arrays;
import java.util.Scanner;
public class Smallest_subarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //elements in the array
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        //the sum with smallest subarray
        int x = sc.nextInt();
        int min_length=subarray(arr, n, x);
        System.out.println(min_length);
        sc.close();
    }
    public static int subarray(int[] arr, int n, int x){
      int windowStart=0;
      int windowEnd=0;
      int sum=0;
      int minLen=Integer.MAX_VALUE;
      int len=0;
      while(windowEnd<n){
        //expansion
        sum+=arr[windowEnd];
        if(sum>x){
            len=windowEnd-windowStart+1;
            minLen=Math.min(minLen,len);
             //shrinking the sliding window
            while(windowStart<windowEnd && sum>x){
                sum-=arr[windowStart];
                windowStart++;
                    if(sum>x){
                        len=windowEnd-windowStart+1;
                        minLen=Math.min(minLen,len);
                    }
            }
    }
    windowEnd++;
   }  
    return (minLen==Integer.MAX_VALUE)?0:minLen;
}
    
}
