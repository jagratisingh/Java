package Arrays;
//calculating the median using 2 equal sorted array of same size 
import java.util.Scanner;
public class Merge_2Equal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr1 = new int[n];
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
        int[] arr2 = new int[m];
        for(int i=0;i<n;i++){
            arr2[i]=sc.nextInt();
        }
        sc.close();     
    }
    public static int Merging(int[] arr1, int[] arr2 , int n, int m) {
        int median=0;
        int merge[] = new int[n+m];
        for(int i=0;i<n+m;i++)
        {
             
        }
        return median;

        
     
    }
    
}
