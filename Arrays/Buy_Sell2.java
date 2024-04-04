package Arrays;
import java.util.Scanner;
public class Buy_Sell2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        Stock(arr,n);
        sc.close();
    }

    //buy and sell atmost twice 
    public static void Stock(int[] arr , int n){
        int profit=0;
        for(int i=1;i<n;i++)
        {
            if(arr[i]>arr[i-1]){
                profit+=arr[i]-arr[i-1];
            }
        }
        System.out.println(profit);
    }
    
}