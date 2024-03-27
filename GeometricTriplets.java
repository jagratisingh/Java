import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class GeometricTriplets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Input size of the array and the common ratio
        System.out.println("Input the size of an array:");
        int n = scanner.nextInt(); // size of arr
        System.out.println("Input the common ratio :");
        int r = scanner.nextInt(); // common ratio
        // Input the array elements
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextLong();
        }
        // Calculate and print the count of triplets forming a geometric progression
        long result = countTriplets(arr, r);
        System.out.println("Result : "+result);
        scanner.close();
    }
    public static long countTriplets(long[] arr, int r) {
        Map<Long, Long> potentialPairs = new HashMap<>();
        Map<Long, Long> potentialTriplets = new HashMap<>();
        long count = 0;
        for (long num : arr) {
            if (num % r == 0) {
                long prev = num / r;
                Long prevCount = potentialTriplets.get(prev);
                if (prevCount != null) {
                    count += prevCount;
                }
                Long pairs = potentialPairs.get(prev);
                if (pairs != null) {
                    potentialTriplets.put(num, potentialTriplets.getOrDefault(num, 0L) + pairs);
                }
            }
            potentialPairs.put(num, potentialPairs.getOrDefault(num, 0L) + 1);
        }
        return count;
    }
}

