package Tcs_coding;
import java.util.Scanner;
public class A1{
    public static void Sum(int[] arr){
        
    }
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size and an array:");
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                  arr[i][j]=sc.nextInt();
            }
        }

        
      }
    
}
