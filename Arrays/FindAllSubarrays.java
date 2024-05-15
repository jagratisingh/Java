package Arrays;
import java.util.Scanner;
public class FindAllSubarrays {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Subarrays(arr, n);
        sc.close();
    }
    public static void Subarrays(int[] arr, int n){
        n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                printSubarray(arr,i ,j);
            }
        }
    }
    private static void printSubarray(int[] arr, int start, int end){
         StringBuilder sb = new StringBuilder();
         sb.append("[");
         for(int i=start;i<=end;i++){
                sb.append(arr[i]);
                if(i!=end){
                    sb.append(",");
                }
         }
         sb.append("]");
         System.out.println(sb.toString());
    }

    
}
