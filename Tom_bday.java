public class Tom_bday {
        public static long tomBday(int b, int w, int bc, int wc, int z) {
            long totalCost;
    
            long blackGiftsCost = Math.min(bc, wc + z);
            long whiteGiftsCost = Math.min(wc, bc + z);
    
            totalCost = (long) b * blackGiftsCost + (long) w * whiteGiftsCost;
            return totalCost;
        }
    
        public static void main(String[] args) {
            int t = 5;
            int[][] testCases = {
                    {10, 10, 1, 1, 1},
                    {5, 9, 2, 3, 4},
                    {3, 6, 9, 1, 1},
                    {7, 7, 4, 2, 1},
                    {3, 3, 1, 9, 2}
            };
    
            for (int i = 0; i < t; i++) {
                int[] testCase = testCases[i];
                int b = testCase[0];
                int w = testCase[1];
                int bc = testCase[2];
                int wc = testCase[3];
                int z = testCase[4];
    
                long result = tomBday(b, w, bc, wc, z);
                System.out.println(result);
            }
        }
 }
    

