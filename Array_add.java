import java.util.*;
public class Array_add {
    public static void Arr_add(int[][] sum, int[][] arr1 , int[][] arr2){
       for(int i =0;i<3;i++){
        for(int j=0;j<3;j++){
              sum[i][j]=arr1[i][j]+ arr2[i][j];
        }
     }
     System.out.println("Addition of two arrays :");
     for(int i =0;i<3;i++){
        for(int j=0;j<3;j++){
              System.out.print(sum[i][j]+" ");
        }
        System.out.println();
     }
    }
    

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
     int[][] sum = new int[3][3];
     System.out.println("Enter Ist array :");
     int[][] arr1 = new int[3][3];
     for(int i =0;i<3;i++){
        for(int j=0;j<3;j++){
              arr1[i][j]=sc.nextInt();
        }
     }
     System.out.println("Enter IInd array :");
     int[][] arr2 = new int[3][3];
     for(int i =0;i<3;i++){
        for(int j=0;j<3;j++){
              arr2[i][j]=sc.nextInt();
        }
     }
     Arr_add( sum, arr1 , arr2);
    
}

}
