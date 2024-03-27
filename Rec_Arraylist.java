import java.util.ArrayList;
public class Rec_Arraylist {
    public static void main(String[] args) {
        int[] arr ={ 1,3,4,5,4,6};
        ArrayList<Integer> ans = findAllIndex(arr, 4, 0,new ArrayList<>());
        System.out.println(ans);
        
    }
    public static ArrayList<Integer> findAllIndex(int[] arr , int target , int index , ArrayList<Integer> list){
         if(index==arr.length){
            return list;
         }
         if(arr[index]==target){
            list.add(index);
         }
         return findAllIndex(arr, target, index+1, list);
    }
}
