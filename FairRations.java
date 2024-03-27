import java.util.Scanner;
public class FairRations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the number of subjects in the bread line: "); 
        int n = scanner.nextInt();
        System.out.println("Input the number of loaves each person starts with:");
        int[] B = new int[n];
        for (int i = 0; i < n; i++) {
            B[i] = scanner.nextInt();
        }
        // Calculate and print the minimum number of loaves required
        String result = fairRations(B);
        System.out.println("Result : "+result);
        scanner.close();
    }
    public static String fairRations(int[] B) {
        int count = 0;
        for (int i = 0; i < B.length - 1; i++) {
            if (B[i] % 2 != 0) {
                B[i]++;
                B[i + 1]++;
                count += 2;
            }
        }
        for (int i : B) {
            if (i % 2 != 0) {
                return "NO"; // It's not possible to distribute bread evenly
            }
        }
        return String.valueOf(count);
    }
}


