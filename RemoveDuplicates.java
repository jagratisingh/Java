import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int length=0;
        int[] result = new int[n];
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){

                if(arr[i]==arr[j]){
                   result[i]=arr[i];
                   length++;
                }
            }
        }
        System.out.print(length +", ");
        for(int i=0;i<n;i++){
            System.out.print(result[i]+ " ");
        }
        }
    }
    
