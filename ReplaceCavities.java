import java.util.Scanner;
public class ReplaceCavities {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the number of rows and columns in the map: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Input each row of the grid: ");
        String[] grid = new String[n];
        for (int i = 0; i < n; i++) {
            grid[i] = scanner.nextLine();
        }
        // Replace the cavity elements in the grid and print the updated map
        String[] result = cavityMap(grid);
        for (String row : result) {
            System.out.println(row);
        }
        scanner.close();
    }
       public static String[] cavityMap(String[] grid) {
        int n = grid.length;
        char[][] matrix = new char[n][n];
        // Convert the string representation to a character matrix
        for (int i = 0; i < n; i++) {
            matrix[i] = grid[i].toCharArray();
        }
        // Traverse through the matrix to identify and replace cavity elements
        for (int i = 1; i < n - 1; i++) {
            for (int j = 1; j < n - 1; j++) {
                if (matrix[i][j] > matrix[i - 1][j] &&
                    matrix[i][j] > matrix[i + 1][j] &&
                    matrix[i][j] > matrix[i][j - 1] &&
                    matrix[i][j] > matrix[i][j + 1]) {
                    // Replace cavity element with 'X'
                    matrix[i][j] = 'X';
                }
            }
        }
        // Convert the character matrix back to string representation
        String[] result = new String[n];
        for (int i = 0; i < n; i++) {
            result[i] = new String(matrix[i]);
        }
        return result;
    }
}


