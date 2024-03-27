public class L_element {
    public static void main(String[] args) {
        int[] arr = {34,5,6,1,2,90};
         int max = arr[0];
         //largest element in an array 
         // for smallest element you can just do reverse < the condition
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("the largest element in an array : "+max);
    }
    
}
