public class Rec_Sorted {
    public static void main(String[] args) {
        int[] arr ={8,1,2,4,6};
        System.out.println(Sorted(arr, 0));
    }
    public static boolean Sorted(int[] arr , int index){
        if(index==arr.length-1){
            return true;
        }
        return arr[index]<arr[index+1] && Sorted(arr, index+1);

    }
}
