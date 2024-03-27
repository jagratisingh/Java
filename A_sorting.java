import java.util.*;
public class A_sorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array :");
        int n = sc.nextInt();
        System.out.println("Enter an array : ");
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        Sorting(arr);
         

    }
    public static void Sorting(int[] arr){
       for(int i=0;i<arr.length;i++){
         for(int j=i+1;j<arr.length;j++){
         if(arr[i]>arr[j]){
            int temp= arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
    }
       }
    
     for(int i=0;i<arr.length;i++)
        {
        System.out.print(arr[i]+" ");
        }
    }

    
}
