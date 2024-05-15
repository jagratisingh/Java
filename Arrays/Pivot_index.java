package Arrays;
import java.util.Scanner;
public class Pivot_index {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int index=Pivot(arr,n);
        System.out.println(index);
        sc.close();
    }
    public static int Pivot(int[] arr,int n){
        n=arr.length;
        int sum=0;
        for(int num:arr){
            sum+=num;
        }
        int leftSum=0;
        for(int i=0;i<n;i++){
            sum-=arr[i];
            if(leftSum==sum){
               return i;
            }
            leftSum+=arr[i];
        }
        return -1;
    }
    
}
