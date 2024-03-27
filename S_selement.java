public class S_selement {
    public static void main(String[] args) {
        int[] arr ={34,2,35,1,7};
        S_element(arr);
    }
    public static void S_element(int[] arr){
        //smallest element in an array
        //same we can do for just replacing the condition
        int min = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println(min);
        int s_ele = arr[0];
        // second smallest element in an array 
        //same we can do for just replacing the condition
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=min && s_ele >arr[i] ){
                s_ele = arr[i];
            }
        }
        System.out.println(s_ele);
    }
}
