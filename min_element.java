public class min_element {
    public static void main(String[] args) {
        int[] arr = {23,34,12,11,67};
        int min =arr[0];
        for(int i=0;i<arr.length;i++){
             if(arr[i]<min){
                   min = arr[i];
             }
        }
        System.out.println("Minimum element in the array :"+min);
    }
}
