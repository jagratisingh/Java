package Arrays;
import java.util.Scanner;
public class Three_partArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int lowValue=sc.nextInt();
        int highValue=sc.nextInt();
        Partioning(arr, n, lowValue, highValue);
        //modifying array according to the problem
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
    public static int[] Partioning(int[] arr, int n ,int lowValue ,int highValue){
            //initialize exact available positions for 
            //smaller(than range) and greater elements
            int start=0;
            int end=n-1;
            //traverse elements from left
            for(int i=0;i<end;){
                //if current element is smaller than
                //range , put it on next available smaller position
                 if(arr[i]<lowValue) 
                 {
                    int temp=arr[start];
                    arr[start]=arr[i];
                    arr[i]=temp;
                    start++;
                    i++;
                 }
                 //if current element is greater than the range 
                 //put it on next available greater position
                 else if(arr[i]>highValue){
                    int temp=arr[end];
                    arr[end]=arr[i];
                    arr[i]=temp;
                    end--;
                 }
                 else{
                    i++;
                 }
            }
            return arr;
    }
    
    
}
