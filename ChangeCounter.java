import java.util.Scanner;
public class ChangeCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       // Input the amount to make change for and the number of coin types
        int n = scanner.nextInt(); // amount to make change for
        int m = scanner.nextInt(); // number of coin types

        // Input the coin denominations
        int[] coins = new int[m];
        for (int i = 0; i < m; i++) {
            coins[i] = scanner.nextInt();
        }
        // Calculate and print the number of ways to make change
        long ways = getWays(n, coins);
        System.out.println(ways);
        scanner.close();
    }
    public static long getWays(int n, int[] coins) {
        long[] ways = new long[n + 1];
        ways[0] = 1;
        for (int coin : coins) {
            for (int i = coin; i <= n; i++) {
                ways[i] += ways[i - coin];
            }
        }
        return ways[n];
    }
}



