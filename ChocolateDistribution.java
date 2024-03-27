import java.util.Scanner;
public class ChocolateDistribution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Input number of test cases
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            // Input number of colleagues
            int n = sc.nextInt();
            // Input number of chocolates each colleague has
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }
            // Calculate and print minimum number of operations needed
            int result = minOperationsToEqualize(arr);
            System.out.println(result);
        }
        sc.close();
    }
    public static int minOperationsToEqualize(int[] arr) {
        int minChocolates = Integer.MAX_VALUE;
        int operations = 0;
        for (int i : arr) {
            minChocolates = Math.min(minChocolates, i);
        }
        for (int i : arr) {
            operations += i - minChocolates;
        }
        return operations;
    }
}


