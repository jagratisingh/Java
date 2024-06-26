package Arrays;
import java.util.Scanner;
public class Rain_water {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int ans = Trapped_water(arr, n);
        System.out.println(ans);
        sc.close();
    }
    public static int Trapped_water(int[] arr , int n){        
        int left[]= new int[n];
        int right[]= new int[n];
        //storing elements according 
        left[0]=arr[0];
        for(int i=1;i<n;i++){
            left[i]=Math.max(left[i-1],arr[i]);
        }
        right[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--){
            right[i]=Math.max(right[i+1],arr[i]);
        }
        //calculating total units 
        int units=0;
        for(int i=0;i<n;i++){
            units+=(Math.min(left[i],right[i])-arr[i]);
        }
        return units;
    }
    
}
