import java.util.Arrays;
import java.util.Scanner;
public class SpaceStations {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            // Input the number of cities (n) and the number of space stations (m)
            System.out.println("Number of cities:");
            int n = scanner.nextInt();
            System.out.println("Number of space stations:");
            int m = scanner.nextInt();
            System.out.println("Input the indices of cities having a space station: ");
            int[] c = new int[m];
            for (int i = 0; i < m; i++) {
                c[i] = scanner.nextInt();
            }
            // Calculate and print the maximum distance any city is from a space station
            int result = maxDistance(n, c);
            System.out.println("Result: " +result);
            scanner.close();
        }
        public static int maxDistance(int n, int[] c) {
            Arrays.sort(c);
            // Maximum distance from the first space station to the first city  
            int maxDistance = c[0];
            for (int i = 1; i < c.length; i++) {
                int distance = (c[i] - c[i - 1]) / 2;
                maxDistance = Math.max(maxDistance, distance);
            }
             // Maximum distance from the last space station to the last city 
            int lastGap = n - 1 - c[c.length - 1];
            maxDistance = Math.max(maxDistance, lastGap);
            return maxDistance;
        }
    }
    
