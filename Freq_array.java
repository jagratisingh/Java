public class Freq_array {
    public static void main(String[] args) {
        int[] arr ={5,4,5,5,6,3,2,1,4};
        for(int i=0;i<arr.length;i++){
            int flag =0;
            int count =0;
              for (int j = i+1; j <arr.length; j++){
                if (arr[i] == arr[j]){
                    flag = 1;
                    break;
                }
            }
             // The continue keyword is used to end the current iteration 
             // in a for loop (or a while loop), and continues to the next iteration
            if (flag == 1)
                continue;

            for(int j=0;j<=i;j++){
                if(arr[i]==arr[j]){
                    count++;
                }        

            }  
            System.out.println(arr[i]+ " the count value : "+count);
           // count=0;
        }
        
    }
    
}
