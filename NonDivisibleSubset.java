import java.util.Scanner;
public class NonDivisibleSubset {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
           // Input the number of values in S and the non-factor k
            System.out.println("Number of values in S:");
            int n = scanner.nextInt();
            System.out.println("Non-factor k: ");
            int k = scanner.nextInt();
            System.out.println("Input the unique values of the set S: ");
            int[] S = new int[n];
            for (int i = 0; i < n; i++) {
                S[i] = scanner.nextInt();
            }
            // Calculate and print the size of the largest possible subset
            int result = nonDivisibleSubset(n, k, S);
            System.out.println(result);
            scanner.close();
        }
        public static int nonDivisibleSubset(int n, int k, int[] S) {
            int[] remainderCount = new int[k];
            // Count the remainders of elements when divided by k
            for (int num : S) {
                remainderCount[num % k]++;
            }
            int count = Math.min(remainderCount[0], 1); // Subset can contain only one multiple of k   
            // Traverse the remainderCount array from 1 to k/2 (inclusive)
            for (int i = 1; i <= k / 2; i++) {
                if (i != k - i) {
                    count += Math.max(remainderCount[i], remainderCount[k - i]);
                } else {
                    count++;
                }
            }
            return count;
        }
}
     