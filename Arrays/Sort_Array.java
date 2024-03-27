//Sorting array , originl array = {0,1,2,1,2,2,1,0}
package Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class Sort_Array {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //creating an array to store the elements
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        
        }
        //this will sort the array
        Arrays.sort(arr);
        System.out.println("Sorted array :");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }


      sc.close();  
    }
}
