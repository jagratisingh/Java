import java.util.Scanner;
public class S_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an array :");
        int[] arr = new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        Add(arr);
    }
    public static void Add(int[] arr){
        int sum =0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
        }
        System.out.println("The sum of the elements in an array :"+sum);
    }
    
}
