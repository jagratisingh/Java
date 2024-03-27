package Arrays;
import java.util.Scanner;

public class kth_smallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //creating an array to store the elements
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
         arr[i]=sc.nextInt();
      }
      //enter the kth value
      int k=sc.nextInt();
      //sort array 
      for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            //ascending order
              if(arr[i]>arr[j]){
                int temp=arr[i];
                 arr[i]=arr[j];
                 arr[j]=temp;

              }
        }
    //will work for distinct element 
        if(i==k-1){
            System.out.println(arr[i]);
            break;
        }
      }
      sc.close();
    }

}
