import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class KaprekarNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Input lower and upper integer limits
        System.out.println("Enter lower limit :");
        int p = scanner.nextInt();
        System.out.println("Enter upper limit :");
        int q = scanner.nextInt();
        // Find and print the modified Kaprekar numbers in the range
        kaprekarNumbers(p, q);
        scanner.close();
    }
    public static void kaprekarNumbers(int p, int q) {
        List<Integer> kaprekarNums = new ArrayList<>();
        for (Integer i = p; i <= q; i++) {
            long square = (long) i * i;
            String squareStr = String.valueOf(square);
            int len = String.valueOf(i).length();
            if (squareStr.length() > 1) {
                long right = Long.parseLong(squareStr.substring(squareStr.length() - len));
                long left = Long.parseLong(squareStr.substring(0, squareStr.length() - len));               
                if (left + right == i) {
                    kaprekarNums.add(i);
                }
            } else if (square == i) {
                kaprekarNums.add(i);
            }
        }
        if (kaprekarNums.isEmpty()) {
            System.out.println("INVALID RANGE");
        } else {
            for (Integer num : kaprekarNums) {
                System.out.print(num + " ");
            }
        }
    }
}


