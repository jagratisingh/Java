package Arrays;
import java.util.Scanner;
import java.util.Arrays;
public class CircularRotation {
    public static void Rotate(int[] arr , int k, int n){
        //taking care of k>n
        n=arr.length;
        k=k%n;
        //reversing the entire array
        reverseArray(arr,0,n-1);
        //reversing the first k elements
        reverseArray(arr,0,k-1);
        //reversing the k+1 elements
        reverseArray(arr,k,n-1);
    }
    public static void reverseArray(int[] arr , int start, int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		int k = sc.nextInt();
		System.out.println("Original Array: "+Arrays.toString(arr));
		Rotate(arr,k,n);
		System.out.println("Rotated Array :"+Arrays.toString(arr));	
        sc.close();	
	}
}
