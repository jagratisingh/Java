package Arrays;
import java.util.Scanner;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
public class Rank_Transformation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int[] transformation = arrayRankTransformation(arr,n);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(transformation));
        sc.close();  
    }
    public static int[] arrayRankTransformation(int[] arr, int n){
       n=arr.length;
       //creating a copy of original array
        int[] temp=Arrays.copyOf(arr,n);
         Arrays.sort(temp);
        //creating a map to store the rank of each distinct elements
        Map<Integer,Integer> rankMap = new HashMap<>();
        int rank=1;
        for(int num:temp){
            if(!rankMap.containsKey(num)){
               rankMap.put(num,rank);
               rank++;
        }
    }
    //perform rank tranformation on the original Array
    int[] result = new int[n];
    for(int i=0;i<n;i++){
        result[i]=rankMap.get(arr[i]);
    }
    return result;
}
}

