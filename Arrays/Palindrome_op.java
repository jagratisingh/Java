package Arrays;
import java.util.Scanner;
public class Palindrome_op {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int opn = Num_Operations(arr, n);
        System.out.println(opn);
        sc.close();
    }
    public static int Num_Operations(int[] arr , int n){
        int opn=0;
        //Start from two corners
        for(int i=0,j=n-1;i<=j; ){
        
            if(arr[i]==arr[j]){
                i++;
                j--;
            }
            else if(arr[i]>arr[j]){
                //need to merge from tail
                j--;
                arr[j]+=arr[j+1];
                opn++;
            }
            //else we merge left two elements 
            else{
                i++;
                arr[i]+=arr[i-1];
                opn++;
            }
        }
        return opn;
    }
    
}
