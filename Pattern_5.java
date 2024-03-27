public class Pattern_5 {
    public static void main(String[] args) {
        P_5(5);
    }
    public static void P_5(int n){
        for(int row =1;row<=2*n;row++){
             int totalColsInRow = row>n? 2*n-row:row;
             for(int col=1;col<=totalColsInRow;col++){
                
                System.out.print("*");
             }
             System.out.println();
        }
    }
    
}
