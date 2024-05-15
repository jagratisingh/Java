package Arrays;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class MajorityElement {
    public static List<Integer> findMajorityElements(int[] nums) {
        List<Integer> majorityElements = new ArrayList<>();
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        // Step 1: Count the frequency of each element
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        // Step 2: Find the majority elements
        int majorityThreshold = nums.length / 2;
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            int num = entry.getKey();
            int count = entry.getValue();
            if (count >=majorityThreshold) {
                majorityElements.add(num);
            }
        }
        return majorityElements;
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n=sc.nextInt();
       int[] nums = new int[n];
       for(int i=0;i<n;i++){
           nums[i]=sc.nextInt();
       }
       List<Integer> list = findMajorityElements(nums);
       System.out.println(list);
       sc.close();
    }
}