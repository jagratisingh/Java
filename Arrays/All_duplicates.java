package Arrays;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
//code for finding all the duplicates 
//[2,3,4 2,5,3]= [2,3]
public class All_duplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        List<Integer> result=All(arr,n);
        System.out.println(result);
        sc.close();
    }
    //remember method statement 
    public static List<Integer> All(int[] arr, int n){
        //use for a way to keep tracking all the duplicates
        ArrayList<Integer> output = new ArrayList<Integer>();
        //hashset doesnot store duplicate value
        HashSet<Integer> store = new HashSet<Integer>();
        for(int i=0;i<n;i++){
            int current=arr[i];
            if(store.contains(current)){
                 output.add(current);
            }
            else
            {
                 store.add(current);
            }
        }
        return output;
    }
    
}
