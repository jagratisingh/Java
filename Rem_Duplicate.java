import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
public class Rem_Duplicate {
    //Solving using set
    public static void main(String[] args) {
       int[] arr ={3,4,5,2,1,2,3,6};
       int n =arr.length;
       Set<Arrays> hash_set = new HashSet<Arrays>();
       for(int i=0;i<n;i++){
        hash_set.add(arr[i]);
        System.out.print(hash_set);
          
       }




    }
}
