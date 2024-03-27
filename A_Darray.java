import java.util.*;
public class A_Darray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an array :");
         int[] arr = new int[6];
         for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
         }
         //here n is using for tell the programmer where we have to 
         //ascending and descending 
         System.out.println("Enter the where you have to perform action: ");
         int n = sc.nextInt();
         Ascending(arr,n);

    }
    public static void Ascending(int[] arr,int n){
         
         Arrays.sort(arr);
         for(int i=0;i<n;i++){
           System.out.print(arr[i]+" ");
         } 
         for(int i=arr.length-1;i>=n;i--){
         System.out.print(arr[i]+" ");
         } 
    }
}
