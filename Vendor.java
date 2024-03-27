import java.util.*;
public class Vendor {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the size :");
        int n = sc.nextInt();
        System.out.println("Enter an array :");
        int[] arr = new int[n];
        int cost=0;
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
      
        for(int i=1;i<arr.length;i++){
             cost=cost+arr[i++];
          }
        System.out.println("The cost  :"+cost);
          
    }
    
}
