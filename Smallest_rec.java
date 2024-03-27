public class Smallest_rec {
    public static void main(String[] args) {
        int[] arr = {54,1,0,-1,3};
        int n = arr.length;
        int a = Smallest(arr,n);
        System.out.println("Smallest number in an array :"+a);

    }
    public static int Smallest(int[] arr , int n){
           //base condition
           if(n==1){
               return arr[0];
           }
           else{
              return Math.min(arr[n-1], Smallest(arr, n-1));
           }
    }
}
