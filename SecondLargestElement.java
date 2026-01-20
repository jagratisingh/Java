import java.util.Scanner;
public class SecondLargestElement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = 4;
        int[] arr = new int[n];
         int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for(int i=0;i<=n;i++){
            arr[i]= sc.nextInt();
            // System.out.print(arr[i]+ " ");
        }
        
        for(int j=0;j<=n;j++){
            if(arr[j]>largest){
                largest = arr[j];
            }else if(arr[j]>secondLargest && arr[j]!=largest){
                secondLargest = arr[j];
            }
        }
        System.out.println(largest);
        System.out.println(secondLargest);
    }
}
