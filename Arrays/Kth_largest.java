package Arrays;
import java.util.Arrays;
import java.util.Scanner;
public class Kth_largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //creating an array to store the elements
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt(); 
        
        }
        //kth largest element
        int k=sc.nextInt();
        Arrays.sort(arr);
        int result = Kth(arr, n,k);
        System.out.println(result);
        sc.close();   
    }
    public static int Kth(int[] arr, int n, int k){
          return arr[n-k];
        
    }

    
}
