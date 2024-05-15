package Arrays;
import java.util.Arrays;
public class Juggling_algo {
    public static void rotateArray(int[] arr, int d) {
        int n = arr.length;
        int gcd = gcd(n, d);
        for (int i = 0; i < gcd; i++) {
            int temp = arr[i];
            int j = i;
            while (true) {
                int k = j + d;
                if (k >= n) {
                    k -= n;
                }
                if (k == i) {
                    break;
                }
                arr[j] = arr[k];
                j = k;
            }
            arr[j] = temp;
        }
    }
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
