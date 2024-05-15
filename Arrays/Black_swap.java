package Arrays;
import java.util.Arrays;
public class Black_swap {
     public static void rotateArray(int[] arr, int d) {
        int n = arr.length;
        d = d % n; // Take care of cases where d is greater than n
        blockSwap(arr, 0, n - d, d);
    }
    private static void blockSwap(int[] arr, int start, int end, int d) {
        int n = arr.length;
        int temp;
        for (int i = 0; i < gcd(d, n); i++) {
            temp = arr[start + i];
            int j = i;
            while (true) {
                int k = j + d;
                if (k >= n) {
                    k -= n;
                }
                if (k == i) {
                    break;
                }
                arr[start + j] = arr[start + k];
                j = k;
            }
            arr[start + j] = temp;
        }
    }
    //calculate gcd
    private static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int d = 2;
        System.out.println("Original array: " + Arrays.toString(arr));
        rotateArray(arr, d);
        System.out.println("Rotated array: " + Arrays.toString(arr));
    }
}
