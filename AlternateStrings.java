import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class AlternateStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Input length of string
        int length = sc.nextInt();
        sc.nextLine(); // Consume newline character
        // Input string
        String s = sc.nextLine();
        // Output the result
        int result = maxLengthAlternateString(s);
        System.out.println(result);

        sc.close();
    }
    public static int maxLengthAlternateString(String s) {
        Set<Character> uniqueChars = new HashSet<>();
        for (char c : s.toCharArray()) {
            uniqueChars.add(c);
        }
        int maxLength = 0;
        for (char c1 : uniqueChars) {
            for (char c2 : uniqueChars) {
                if (c1 != c2) {
                    StringBuilder sb = new StringBuilder();
                    for (char ch : s.toCharArray()) {
                        if (ch == c1 || ch == c2) {
                            sb.append(ch);
                        }
                    }
                    if (isAlternating(sb.toString())) {
                        maxLength = Math.max(maxLength, sb.length());
                    }
                }
            }
        }

        return maxLength;
    }

    public static boolean isAlternating(String s) {
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                return false;
            }
        }
        return true;
    }
}
