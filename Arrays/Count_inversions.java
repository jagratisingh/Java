package Arrays;
import java.util.Scanner;
public class Count_inversions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //creating an array to store the elements
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
          arr[i]=sc.nextInt();
        } 
        Inversions(arr, n);
        sc.close();
      
    }
    public static void Inversions(int[] arr, int n){
        //{8,4,2,1}-6 
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){ 
                if(arr[i]>arr[j] && i<j){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
