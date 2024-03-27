import java.util.Arrays;
public class Distinct_array{
    public static void main(String[] args){
        int[] arr ={2,1,4,2,2,5,6,7};
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
       // System.out.print(arr+" ");
        System.out.println("Distinct elements in an array :"+Distinct(arr));

    }
      public static int Distinct(int[] arr){
         int count=1;
         for(int i=1;i<arr.length;i++){
             if(arr[i]!=arr[i-1]){
                   count++;
             }
         }
         return count;
        
        
      }
    

}

