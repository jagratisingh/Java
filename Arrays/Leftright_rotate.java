package Arrays;
import java.util.Arrays;
public class Leftright_rotate {
     public static void rotateLeft(int[] arr, int d) {
        int n = arr.length;
        d = d % n; // Take care of cases where d is greater than n
        reverseArray(arr, 0, d - 1);
        reverseArray(arr, d, n - 1);
        reverseArray(arr, 0, n - 1);
    }
    public static void rotateRight(int[] arr, int d) {
        int n = arr.length;
        d = d % n; // Take care of cases where d is greater than n
        reverseArray(arr, 0, n - d - 1);
        reverseArray(arr, n - d, n - 1);
        reverseArray(arr, 0, n - 1);
    }
    private static void reverseArray(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int d = 2;
        System.out.println("Original array: " + Arrays.toString(arr));
        rotateLeft(arr, d);
        System.out.println("Array rotated left by " + d + " positions: " + Arrays.toString(arr));
        arr = new int[]{1, 2, 3, 4, 5}; // Reset the array
        rotateRight(arr, d);
        System.out.println("Array rotated right by " + d + " positions: " + Arrays.toString(arr));
    }
}
