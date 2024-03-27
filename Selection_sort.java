public class Selection_sort {
    public static void main(String[] args) {
        int[] arr ={ 3,4,1,5,6,2};
        Sort(arr);

        
    }
    public static void Sort(int[] arr){
        //finding the minimum element in an array
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(min>arr[i]){
                 min=arr[i];
            }
        
        //swap with the found minimum element with the first element 
        int temp=arr[min];
        arr[min]=arr[i];
        arr[i]=temp;
        }
        //print the array 
        for(int i=0;i<arr.length;i++){
            System.out.print("Selection sort:"+arr[i]+" ");
        }

    }
 
}
