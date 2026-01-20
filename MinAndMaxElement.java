import java.util.Scanner;

public class MinAndMaxElement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        // i=0;i<=5
        // i=0; arr[0]= 3;
        // i=1. arr[1]= 2;
        // i=2. arr[2]=8;
        // i=3. arr[3]=9;
        // i=4;arr[4]=2;
        // i=5;arr[5]=0;
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        int min=Integer.MAX_VALUE;
        int max= Integer.MIN_VALUE;
        for(int j=0;j<n;j++){
           if(arr[j]<min){
             min=arr[j];
           }
        }
        for(int j=0;j<n;j++){
           if(arr[j]>max){
             max=arr[j];
           }
        }
        System.out.println("Min = " +min+", "+"Max = "+max);

    }
    
}
