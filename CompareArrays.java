import java.util.Arrays;
import java.util.Scanner;
public class CompareArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Input the number of elements in arrays a and b
        System.out.println("Number of elements in array a: ");
        int n = scanner.nextInt();
        System.out.println("Number of elements in array b: "); 
        int m = scanner.nextInt(); 
        System.out.println("Enter a array elements :");
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
         System.out.println("Enter b array elements:");
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = scanner.nextInt();
        }
        // Calculate and print the number of integers between the sets
        int result = getTotalX(a, b);
        System.out.println(result);
        scanner.close();
    }
    public static int getTotalX(int[] a, int[] b) {
        int count = 0;
        int maxA = Arrays.stream(a).max().getAsInt();
        int minB = Arrays.stream(b).min().getAsInt();
        for (int i = maxA; i <= minB; i++) {
            if (isBetweenSets(i, a, b)) {
                count++;
            }
        }
        return count;
    }
    public static boolean isBetweenSets(int x, int[] a, int[] b) {
        for (int num : a) {
            if (x % num != 0) {
                return false;
            }
        }
        for (int num : b) {
            if (num % x != 0) {
                return false;
            }
        }
        return true;
    }
}

