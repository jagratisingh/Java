import java.util.Arrays;
public class Non_repeating {
    public static void main(String[] args){
        int[] arr ={2,1,4,2,2,5,6,7};
        int n = arr.length;
        count_freq(arr,n);
      

    }
      public static void count_freq(int[] arr,int n){
        boolean visited[] = new boolean[n];
        Arrays.fill(visited,false);
        for(int i=0;i<n;i++){
            if(visited[i]==true){
                 continue;
            }
            //count frequency
            int count =1;
            for(int j=i+1;j<n;j++){
               if(arr[i]==arr[j]){
                    visited[j] = true;
                    count++;

               }   
            }
            if(count==1){
                System.out.print(arr[i]+" ");
            }

        }
       
        
        
      }
    
}
