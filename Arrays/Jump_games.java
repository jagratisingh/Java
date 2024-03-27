package Arrays;
import java.util.Scanner;
public class Jump_games {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      //creating an array to store the elements
      int[] arr = new int[n];
      for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
      }
      int result=Games(arr, n);
      System.out.println(result);
      sc.close();
    }
    public static int Games(int[] arr,int n ){
      int totaljumps=0;
      int coverage=0;
      int lastjumpidx=0;
      int destination=n-1;
      //base case 
      if(n==1){
        return 0;
      }
      //greedy strategy : extended coverage as long as possible
      for(int i=0;i<n;i++){
        coverage= Math.max(coverage, i+arr[i]);
        if(i==lastjumpidx){
           lastjumpidx=coverage;
           totaljumps++;
           //check if we are reached destination only
           if(coverage>=destination){
              return totaljumps;
           }
        }
      }
      return totaljumps;
    }
  }
