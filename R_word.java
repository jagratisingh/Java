public class R_word {
        static void remove(String str, String word) {
        String msg[] = str.split(" ");
        String new_str = "";

        // Iterating the string using for each loop
        for (String words : msg) {

            // If desired word is found
            if (!words.equals(word)) {
                // Concat the word not equal to the given word
                new_str += words + " ";
            }
        }
        // Print the new String
        System.out.print(new_str);

    }
    public static void main(String[] args) {
          // Custom string as input
        String str = "This is the Jagrati";
        // Word to be removed from above string
        String word = "the";
        // Calling the method 1 by passing both strings to it
        remove(str, word);
    }
    
}
