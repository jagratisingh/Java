package Arrays;
//import java.util.Scanner;
import java.util.Arrays;
public class Move_neg {
    public static void main(String[] args) {
        int[] arr ={ 1,-2,-4,5,2,6,7,8,-3,-1,9};
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
