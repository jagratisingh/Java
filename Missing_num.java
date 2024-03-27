import java.util.Arrays;

public class Missing_num{
    public static void main(String[] args) {
        int[] arr ={4,0,2,1};
        Missing(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static int Missing(int[] arr){
        int i=0;
        while(i<arr.length){
             int correct_index = arr[i];
             if(arr[i]<arr.length && arr[i]!=arr[correct_index]){
                swap(arr,i,correct_index);
             }
             else
             {
                 i++;
             }
        }
        //search for first missing number
        for(int index=0;i<arr.length;index++){
              if(arr[index]!=index){
                  return index;
              }
        }
        //case: 2 if n is not present in an array
        return arr.length;
    }
    public static void swap(int[] arr , int first , int second){
        int temp= arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
 }

