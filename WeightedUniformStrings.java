import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class WeightedUniformStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Input the original string
        String s = scanner.nextLine();
        // Input the number of queries
        int n = scanner.nextInt();
        // Input the weights for queries
        int[] queries = new int[n];
        for (int i = 0; i < n; i++) {
            queries[i] = scanner.nextInt();
        }
        // Get the answers for the queries
        String[] results = weightedUniformStrings(s, queries);
        // Output the results for each query
        for (String result : results) {
            System.out.println(result);
        }
        scanner.close();
    }
    public static String[] weightedUniformStrings(String s, int[] queries) {
        Set<Integer> weights = new HashSet<>();
        char prevChar = '-';
        int count = 0;
        for (char c : s.toCharArray()) {
            if (c == prevChar) {
                count++;
            } else {
                count = 1;
                prevChar = c;
            }
            weights.add((c - 'a' + 1) * count);
        }
        String[] results = new String[queries.length];
        for (int i = 0; i < queries.length; i++) {
            if (weights.contains(queries[i])) {
                results[i] = "Yes";
            } else {
                results[i] = "No";
            }
        }
        return results;
    }
}
