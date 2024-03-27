import java.util.Scanner;
public class DivisorDigits {
    // Function to count the number of digits in n that are divisors of n
    public static int findDigits(int n) {
        int count = 0;
        int originalN = n;

        while (n > 0) {
            int digit = n % 10;
            if (digit != 0 && originalN % digit == 0) {
                count++;
            }
            n /= 10;
        }

        return count;
    }

    // Function to process multiple test cases
    static int[] countDivisorDigits(int t, int[] testCases) {
        int[] results = new int[t];

        for (int i = 0; i < t; i++) {
            results[i] = findDigits(testCases[i]);
        }

        return results;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of test cases: ");
        int t = sc.nextInt();

        int[] testCases = new int[t];

        System.out.println("Enter the test cases:");
        for (int i = 0; i < t; i++) {
            testCases[i] = sc.nextInt();
        }

        int[] output = countDivisorDigits(t, testCases);

        System.out.println("Output:");
        for (int result : output) {
            System.out.println(result);
        }

        sc.close();
    }
}


