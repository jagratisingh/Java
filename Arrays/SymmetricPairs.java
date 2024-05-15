package Arrays;
import java.util.ArrayList;
import java.util.List;
public class SymmetricPairs {
    public static List<List<Integer>> findSymmetricPairs(int[] nums) {
        List<List<Integer>> symmetricPairs = new ArrayList<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int num1 = nums[i];
                int num2 = nums[j];
                int rev1 = reverse(num1);
                int rev2 = reverse(num2);
                if (num2 == rev1 && num1 == rev2) {
                    List<Integer> pair = new ArrayList<>();
                    pair.add(num1);
                    pair.add(num2);
                    symmetricPairs.add(pair);
                }
            }
        }
        return symmetricPairs;
    }
    private static int reverse(int num) {
        int rev = 0;
        while (num > 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num /= 10;
        }
        return rev;
    }
    public static void main(String[] args) {
        int[] nums = {11, 22, 33, 17, 44, 88, 92, 29};
        List<List<Integer>> symmetricPairs = findSymmetricPairs(nums);
        System.out.println("Symmetric Pairs: " + symmetricPairs);
    }
}

