public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {12,43,45,67,89,90};
        int target = 67;
        int ans = BS(arr,target);
        System.out.println(ans);
    }
    
public static int BS(int[] arr, int target)
{
      int start=0;
      int end = arr.length-1;

      while(start<=end){
         int mid =start+(end-start)/2;
     
      if(target<arr[mid]){
            end = mid-1;
      }
      else if(target >arr[mid]){
            start=mid+1;
      }
      else
      {
         return mid;//return the index
      }
    }
return -1;//if element doesn't exist the return -1
}
}
