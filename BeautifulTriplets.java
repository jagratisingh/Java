
 public class BeautifulTriplets {
    public static int beautifulTriplets(int d, int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                if (arr[j] - arr[i] == d) {
                    for (int k = j + 1; k < arr.length; k++) {
                        if (arr[k] - arr[j] == d) {
                            count++;
                        }
                    }
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 7, 8, 10};
        int n = 7;
        int d = 3;
        int result = beautifulTriplets(d, arr);
        System.out.println("Number of beautiful triplets: " + result); // Output: 3
    }
}
 
