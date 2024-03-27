import java.util.Scanner;
public class Linear_search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter the array:");
        for(int i=0;i<arr.length;i++){
             arr[i]=sc.nextInt();
        }
       System.out.println(Search(arr));
        
    }
    public static int Search(int[] arr){
        int n = 43;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==n){
                  return n;
            }
           
        }
        return -1;

         
    }
    
}
