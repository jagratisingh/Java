public class Rec_linear {
    public static void main(String[] args) {
        int[] arr = {4,1,3,5,2};
        int target =2;
        int res = Search(arr,target, 0);
        System.out.println(res);

    }
    public static int Search(int[] arr ,int target ,int index){
        if(index==arr.length){
            return -1;
        }
        if(arr[index]==target && arr[index]<arr.length){
            return index;
        }
        else
        {
        return Search(arr, target, index+1);
        }
    }
   
}
