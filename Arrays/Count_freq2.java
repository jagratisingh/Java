package Arrays;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class Count_freq2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Map<Integer,Integer> fm = CountFrequency(arr, n);
        for(Map.Entry<Integer,Integer> entry = fm.entrySet()){
            System.out.println(entry.getKey()+","+entry.getValue());
        }
    }
    public static Map<Integer,Integer> CountFrequency(int[] arr, int n){
        Map<Integer,Integer> fm = new HashMap<>();
        for(int num : arr){
            fm.put(num, fm.getOrDefault(num,0)+1);
        }
    }
    return fm;
}
