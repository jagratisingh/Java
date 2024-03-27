import java.util.*;
public class Rotate_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size :");
        int n = sc.nextInt();
        System.out.println("Enter an array ");
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the value where you want to rotate :");
        int r = sc.nextInt();
        for(int i=r;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        for(int i=0;i<n-r;i++){
            System.out.print(arr[i]+" ");
        }
        
    
        
        
    }
    

    
}
