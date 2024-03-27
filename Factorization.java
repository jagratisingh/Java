
import java.util.Arrays;
public class Factorization {
    
    public static int[] calculateFactors(int num) {
        int[] factors = new int[num]; // Assuming the maximum number of factors is num
        int count = 0;
        
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                factors[count++] = i;
            }
        }
        
        return Arrays.copyOf(factors, count);
    }
    
    public static int[] calculatePrimeFactors(int num) {
        int[] primeFactors = new int[num]; // Assuming the maximum number of prime factors is num
        int count = 0;
        int i = 2;
        
        while (i <= num) {
            if (num % i == 0) {
                primeFactors[count++] = i;
                num = num / i;
            } else {
                i++;
            }
        }
        
        return Arrays.copyOf(primeFactors, count);
    }
    
    public static void main(String[] args) {
        int number = 10;
        int[] factors = calculateFactors(number);
        int[] primeFactors = calculatePrimeFactors(number);
        
        System.out.println("Factors of " + number + " are: " + Arrays.toString(factors));
        System.out.println("Prime factors of " + number + " are: " + Arrays.toString(primeFactors));
    }
}
