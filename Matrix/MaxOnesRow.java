package Matrix;
import java.util.Arrays;
public class MaxOnesRow {
    // This method takes a 2D array of integers (mat) as input
    // and returns an array containing the row index with the maximum number of ones
    // and the count of ones in that row
    public static int[] maxOnesRow(int[][] mat) {
        int maxOnes = 0; // Initialize maxOnes to 0
        int maxRow = 0; // Initialize maxRow to 0
        // Iterate over each row in the matrix
        for (int i = 0; i < mat.length; i++) {
            int count = 0; // Initialize count to 0 for each row
            // Iterate over each element in the current row
            for (int num : mat[i]) {
                // If the element is 1, increment the count
                if (num == 1) {
                    count++;
                }
            }
            // If the current count is greater than maxOnes, update maxOnes and maxRow
            if (count > maxOnes) {
                maxOnes = count;
                maxRow = i;
            }
            // If the current count is equal to maxOnes, update maxRow to the smaller row index
            else if (count == maxOnes) {
                maxRow = Math.min(maxRow, i);
            }
        }
        // Return an array containing the maxRow and maxOnes
        return new int[]{maxRow, maxOnes};
    }
    public static void main(String[] args) {
        // Test case 1
        int[][] mat1 = {{0, 1}, {1, 0}};
        int[] result1 = maxOnesRow(mat1);
        System.out.println(Arrays.toString(result1)); // Output: [0, 1]
        // Test case 2
        int[][] mat2 = {{0, 0, 0}, {0, 1, 1}};
        int[] result2 = maxOnesRow(mat2);
        System.out.println(Arrays.toString(result2)); // Output: [1, 2]
        // Test case 3
        int[][] mat3 = {{0, 0}, {1, 1}, {0, 0}};
        int[] result3 = maxOnesRow(mat3);
        System.out.println(Arrays.toString(result3)); // Output: [1, 2]
    }
}