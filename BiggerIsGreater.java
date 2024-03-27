import java.util.Scanner;
public class BiggerIsGreater {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input the number of test cases: ");
            int t = scanner.nextInt();
            // Process each test case
            for (int i = 0; i < t; i++) {
                System.out.println("Input the string for the test case:");
                String w = scanner.next();
                // Find the next lexicographically greater string
                String result = biggerIsGreater(w);
                System.out.println(result);
            }
            scanner.close();
        }
        public static String biggerIsGreater(String w) {
            char[] arr = w.toCharArray();
            // Find the longest non-increasing suffix
            int i = arr.length - 1;
            while (i > 0 && arr[i - 1] >= arr[i]) {
                i--;
            }
             // If the entire string is non-increasing, no answer is possible
            if (i <= 0) {
                return "no answer";
            }
            // Find the rightmost character greater than the pivot
            int j = arr.length - 1;
            while (arr[j] <= arr[i - 1]) {
                j--;
            }
            // Swap the pivot with the rightmost character greater than itself
            char temp = arr[i - 1];
            arr[i - 1] = arr[j];
            arr[j] = temp;
           // Reverse the suffix
            j = arr.length - 1;
            while (i < j) {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
           // Return the resulting string
            return new String(arr);
        }
    }
    
