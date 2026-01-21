import java.util.Scanner;

public class MovesAllZero {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr  = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int temp;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
               temp=arr[n-1-i];
               arr[n-1-i]=arr[i];
               arr[i]=temp;
            }     
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+ " ");
        }
    }
    
}
