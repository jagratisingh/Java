public class Asc_des {
    public static void main(String[] args) {
        int[] arr ={34,1,23,56,78,19};
        Order(arr);
        int n = arr.length;
        for(int i=0;i<n/2;i++){
            System.out.print(arr[i]+" ");
        }
        for(int i=n-1;i>n/2;i--){
            System.out.print(arr[i]+" ");
        }

    }
    public static void Order(int[] arr){
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            if(arr[i]>arr[j]){
                  int temp=arr[i];
                  arr[i]=arr[j];
                  arr[j]=temp;
            }
        }
    
       /*  for(int i=0;i<arr.length-1;i++){
             System.out.print(arr[i]+" ");
        } */
    }
}

