import java.util.Scanner;
public class Encryption {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the string to encrypt: ");
        String s = scanner.nextLine();
       // Encrypt and print the encoded message
        String result = encryption(s);
        System.out.println(result);
        scanner.close();
    }
    public static String encryption(String s) {
        s = s.replaceAll("\\s+", ""); // Remove any spaces in the input string
        int length = s.length();
        double sqrt = Math.sqrt(length);
        int rows = (int) Math.floor(sqrt);
        int columns = (int) Math.ceil(sqrt);
        // Ensure that rows * columns >= length
        if (rows * columns < length) {
            rows++;
        }
        StringBuilder encryptedMessage = new StringBuilder();
        // Construct the encrypted message
        for (int j = 0; j < columns; j++) {
            for (int i = 0; i < rows; i++) {
                int index = i * columns + j;
                if (index < length) {
                    encryptedMessage.append(s.charAt(index));
                }
            }
            encryptedMessage.append(" ");
        }
        return encryptedMessage.toString().trim();
    }
}

