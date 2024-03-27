import java.util.Arrays;

public class Count_Distinct {
    public static void countFreq(int arr[], int n)
   {
         boolean visited[] = new boolean[n];
         //Arrays class in Java to initialize all elements of the visited array with the value false
         Arrays.fill(visited, false);
         int count_dis=0;
         // Traverse through array elements and
         // count frequencies
         for (int i = 0; i < n; i++) {

            // Skip this element if already processed
            if (visited[i] == true)
             continue;

           
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                   visited[j] = true;
                   
                }
            }
            count_dis = count_dis+1;
   }
   System.out.println("count of distinct element : " +count_dis);
  }

   // Driver code
    public static void main(String []args)
    {
      int arr[] = {10, 30, 40, 20, 10, 20, 50, 10};
      int n = arr.length;
      countFreq(arr, n);
    }
}
