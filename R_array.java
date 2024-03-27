import java.util.Scanner;
public class R_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an array :");
         int[] arr = new int[5];
         for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
         }
         Reverse(arr);
    }
    public static void Reverse(int[] arr){
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }
    
}
