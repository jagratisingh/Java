import java.util.Scanner;
public class Abs_dff {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] arr = new int[r][c];
       //entering 2 dimensional array
        System.out.println("Entering 2D array:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                 arr[i][j]=sc.nextInt();
            }
        }
        int suml=0;
        int sumr=0;
        // Calculate sum along the main diagonal
        for(int i = 0, j = 0; i < r && j < c; i++, j++) {
            suml += arr[i][j];
        }
          // Calculate sum along the secondary diagonal
        for(int i = 0, j = c - 1; i < r && j >= 0; i++, j--) {
            sumr += arr[i][j];
        }

        int abs = Math.abs(sumr-suml);
        System.out.println(abs);

    }
}
