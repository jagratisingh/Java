package Matrix;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class CommonElements {
    public static List<Integer> findCommonElements(int[][] matrix) {
        // Create a HashSet with the elements of the first row
        Set<Integer> commonElements = new HashSet<>();
        for (int num : matrix[0]) {
            commonElements.add(num);
        }
        // Iterate through the remaining rows
        for (int i = 1; i < matrix.length; i++) {
            Set<Integer> rowSet = new HashSet<>();
            // Create a HashSet with the elements of the current row
            for (int num : matrix[i]) {
                rowSet.add(num);
            }
            // Keep only the elements that are present in both the current row and the commonElements set
            commonElements.retainAll(rowSet);
        }
        // Convert the HashSet to a List
        List<Integer> commonElementsList = new ArrayList<>(commonElements);
        return commonElementsList;
    }
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 1, 4, 8},
            {3, 7, 8, 5, 1},
            {8, 7, 7, 3, 1},
            {8, 1, 2, 7, 9}
        };
        List<Integer> commonElements = findCommonElements(matrix);
        System.out.println("Common elements in all rows: " + commonElements);
    }
}

