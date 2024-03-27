
import java.util.*;
public class Pascal {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n :");
        int n =sc.nextInt();
        int[][] arr = Pascal(n);
        PrintMatrix(arr);
        
      }
    public static int[][] Pascal(int n){
        int[][] arr=new int[n][];
        for(int i=0;i<n;i++){
            //create spaces for column 
            arr[i]=new int[i+1];
        //In pascal first and last row is 1
         arr[i][0]=arr[i][i]=1;
         //third rule is p[i][j]=p[i-1][j]+p[i-1][j-1];
         for(int j=1;j<i;j++){
              arr[i][j]= arr[i-1][j]+arr[i-1][j-1];
         }
            
        }
        return arr;
    }

    public static void PrintMatrix(int[][] matrix){
        System.out.println("Here is the pascal triangle :");
         for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
         }
    }
        
   }
    

