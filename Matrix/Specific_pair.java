package Matrix;
public class Specific_pair {
    public class MaxMatrixDifference {
        public static int findMaxDifference(int[][] mat) {
            int n = mat.length;
            int maxDiff = Integer.MIN_VALUE;   
            for (int a = 0; a < n - 1; a++) {
                for (int b = 0; b < n - 1; b++) {
                    for (int c = a + 1; c < n; c++) {
                        for (int d = b + 1; d < n; d++) {
                            int diff = mat[c][d] - mat[a][b];
                            maxDiff = Math.max(maxDiff, diff);
                        }
                    }
                }
            }   
            return maxDiff;
        }    
        public static void main(String[] args) {
            int[][] mat = {
                    {1, 2, -1, -4, -20},
                    {-8, -3, 4, 2, 1},
                    {3, 8, 6, 1, 3},
                    {-4, -1, 1, 7, -6},
                    {0, -4, 10, -5, 1}
            };  
            int maxDifference = findMaxDifference(mat);
            System.out.println("The maximum difference is: " + maxDifference);
        }
    }
}
