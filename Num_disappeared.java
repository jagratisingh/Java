import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//Asked in google
public class Num_disappeared {
     public static void main(String[] args) {
       //
      //  System.out.println(findDisappearedNumbers(nums));


     }
      public static List<Integer> findDisappearedNumbers(int[] nums) {
        int i=0;
        while(i<nums.length){
             int correct = nums[i]-1;
             if(nums[i]!=nums[correct]){
                 swap(nums, i , correct);
             }
             else
             {
                i++;
             }
        }
        //just finding missing number
        List<Integer> ans = new ArrayList<>();
        for(int index=0;index<nums.length;index++){
            if(nums[index]!=index+1){
                ans.add(index + 1);
            }
        }
        return ans;
    }
    public static void swap(int[] nums , int first , int second){
          int temp=nums[first];
          nums[first]=nums[second];
          nums[second]=temp;

    }
}
