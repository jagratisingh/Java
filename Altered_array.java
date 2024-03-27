import java.util.Scanner;
public class Altered_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the k value where you have to rotate :");
        int k = sc.nextInt();
        System.out.println("Enter the size :");
        int n = sc.nextInt();
        System.out.println("Enter an array :");
        int[] arr = new int[n];
        int l =arr.length;
        for(int i=0;i<l;i++){
             arr[i]=sc.nextInt();
        }
        int[] ans=Rotate(arr,k,l);
        for(int i=0;i<l;i++){
            System.out.print(ans[i]+" ");
        }

    }
    public static int[] Rotate(int[] arr,int k,int l){
        if(k>l)
         {
            k=k%l;
         }
         int[] ans = new int[l];
        for(int i=0;i<k;i++){
              ans[i]=arr[l-k+i];
        }
        int index =0;      
        for(int i=k;i<l;i++){
            ans[i]=arr[index++];
        }
        return ans;
    
    }
    
}
