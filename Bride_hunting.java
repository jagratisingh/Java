import java.util.Scanner;
public class Bride_hunting {
    public static void main(String[] args) {
        System.out.println("Enter the row :");
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        System.out.println("Enter the col :");
        int c = sc.nextInt();
        int fc = -1;//bride with maximum number of qualities
        int fr=1; //position of best bride
        int fc1=1; //position of best bride 
        int[][] arr = new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                 arr[i][j]=sc.nextInt();
            }
        }

        
    }
    
}
