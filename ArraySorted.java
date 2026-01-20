import java.util.Scanner;

public class ArraySorted {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        boolean result = checkSortedArray(arr, n);
        System.out.println("Is array sorted (ascending)? " + result);
        sc.close();
    }
    
    public static boolean checkSortedArray(int[] arr, int n){
        for(int i = 0; i < n - 1; i++){
            if(arr[i] > arr[i + 1]){
                return false;
            }
        }
        return true;
    }
}