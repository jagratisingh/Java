import java.util.Arrays;

public class Rec_Quick {
    public static void main(String[] args) {
        int[] arr = {3,2,1,4,6};
        QuickSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void QuickSort(int[] arr , int low , int high){
        //base condition
         if(low>=high){
            return;
         }
          int s=low;
          int e=high;
          int m=s+(e-s)/2;
          int pivot=arr[m];
          //if already sorted 
          if(s<=e){
              while(arr[s]<pivot){
                s++;
              }
              while(arr[e]>pivot){
                e--;
              }
          }
          //if not
          if(s<=e){
               int temp=arr[s];
               arr[s]=arr[e];
               arr[e]=temp;
               s++;
               e--;
          }
          //pivot is on correct place so call the sort
          QuickSort(arr, low,e);
          QuickSort(arr, s,high);


    }
}
