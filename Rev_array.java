public class Rev_array {
    public static void main(String[] args) {
        int[] arr ={34,12,124,23,45};
        Reverse(arr);
        
    }
    public static void Reverse(int[] arr){
        int n=arr.length;
        int start = 0, end = n-1;
        while(start<end){
           int temp = arr[start];
           arr[start]=arr[end];
           arr[end]=temp;
           start++;
           end--;
        }
         for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
