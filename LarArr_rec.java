import java.util.Scanner;
public class LarArr_rec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
              arr[i]=sc.nextInt();
        }
        Lar_element(arr, n);
        System.out.println("Largest element in an array:"+Lar_element(arr, n));
        
    }
    public static int Lar_element(int[] arr , int n){
        //base condition
        int i;    
        int max=arr[0];
        for(i=1;i<n;i++){
            if(max<arr[i]){
                  max=arr[i];
                  
            }
             
              
        }
        return max;
         
    }
        
}
    