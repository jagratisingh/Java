import java.util.*;
public class Transpose{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int r = sc.nextInt();
    int c = sc.nextInt();
    System.out.println("Enter a 2D array :");
    int[][] arr = new int[r][c];
    for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            arr[i][j]=sc.nextInt();
        }
    }
   //Transpose elements
    int[][] ans = new int[r][c];
	for(int i=0;i<r; i++){
	    for(int j=0;j<c;j++){
	        ans[i][j]=arr[j][i];
	    }
	}
	for(int i=0;i<r;i++){
	    for(int j=0;j<c;j++){
	        System.out.print(ans[i][j]+" ");
	    }
	    System.out.println();
	}
    //reverse the column for 90 degree
    for(int i=0;i<r;i++){
        for(int j=r-1;j>=0;j--){
            System.out.print(ans[i][j]+" ");
        }
        System.out.println();
    }
}
}
