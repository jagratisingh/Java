import java.util.Scanner;
public class MaxSubarraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Input number of test cases
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            // Input length of array
            int n = sc.nextInt();
            // Input array elements
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }
            // Calculate and print maximum subarray sum and maximum subsequence sum
            int[] result = maxSubarray(arr);
            System.out.println(result[0] + " " + result[1]);
        }
        sc.close();
    }
    public static int[] maxSubarray(int[] arr) {
        int maxSubarraySum = arr[0];
        int currentMax = arr[0];
        int maxSubsequenceSum = arr[0] > 0 ? arr[0] : 0;
        for (int i = 1; i < arr.length; i++) {
            currentMax = Math.max(arr[i], currentMax + arr[i]);
            maxSubarraySum = Math.max(maxSubarraySum, currentMax);
            if (arr[i] > 0) {
                maxSubsequenceSum += arr[i];
            }
        }
        return new int[]{maxSubarraySum, maxSubsequenceSum};
    }
}


