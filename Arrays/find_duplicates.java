package Arrays;
import java.util.Scanner;
public class find_duplicates {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      //creating an array to store the elements
      int[] arr = new int[n];
      for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
      }
      int result=Duplicates(arr,n);
      System.out.println(result);
      sc.close();

    }
    public static int Duplicates(int[] arr , int n){
        //brute force : when only one ele is duplicate in whole arr
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                     return arr[i];
                }
            }
        }
        return -1;
    }
}
