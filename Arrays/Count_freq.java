package Arrays;
import java.util.Arrays;
import java.util.Scanner;
public class Count_freq {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Count(arr,n);
        sc.close();

    }
    public static void Count(int[] arr , int n){
        boolean[] visited = new boolean[n];
      
        Arrays.fill(visited, false);
        for (int i = 0; i < n; i++) {
            // skip if visited array is true
            if (visited[i]==true) {
                continue;
            }
            // count the frequencies for each element 
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    count++;
                }
            }
            System.out.println(arr[i]+ ":"+count);
        }
    }
    
}
