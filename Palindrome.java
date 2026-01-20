public class Palindrome {
    public static void main(String[] args) {
        String original = "racecar";
        boolean isPalindrome = checkPalindrome(original);       
        System.out.println("Original: " + original);
        System.out.println("Is Palindrome: " + isPalindrome);   

        
    }

    public static boolean checkPalindrome(String input) {
        int left = 0;
        int right = input.length() - 1;
        while (left < right) {
            if (input.charAt(left) != input.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
       