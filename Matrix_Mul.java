public class Matrix_Mul {
    public static void main(String[] args) {
        //creating two methods 
        int[][] a ={{1,3,4},{3,4,5},{5,5,6}};
        int[][] b ={{3,4,5},{4,1,2},{6,5,6}};
        //creating another matrix to store the multiplication of two matrices
        int[][] c = new int[3][3];
        //multilpying and printing multiplication of 2 matrices 
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++){
                c[i][j]=0;
               for(int k=0;k<3;k++){
                c[i][j]+=a[i][k]*b[k][j];
               }
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
            System.out.print(c[i][j]+" ");
        }
        System.out.println();
    }


    }
    
}
