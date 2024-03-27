public class Selection_Sort1 {
    public static void main(String[] args) {

	         int[] arr ={ 3,4,1,5,6,2};
              System.out.println("Unsorted Array :");
              for(int j=0;j<arr.length;j++){
                System.out.print(arr[j]+" ");
              }
 
             for(int i=0;i<arr.length;i++){
             int min=i;
             for(int j=i+1;j<arr.length;j++){
                  if(arr[min]>arr[j]){
                    min=j;
                 }
            }   
            //swap with the minimum element in an Array
             int temp=arr[min];
             arr[min]=arr[i];
             arr[i]=temp;
             }
             System.out.println();
             System.out.println("Sorted Array :");
             for(int j=0;j<arr.length;j++){
                System.out.print(arr[j]+" ");
             }
            }
            

        }
       
