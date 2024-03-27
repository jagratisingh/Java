public class Pattern_7 {
    public static void main(String[] args) {
        P_7(4);
    }
    public static void P_7(int n){
        for(int row=1;row<=n;row++){
             for(int noOfSpaces=1;noOfSpaces<=n-row;noOfSpaces++){
                        System.out.print("  ");
             }
             for(int col=row;col>=1;col--){
                  System.out.print(col+ " ");
             }
             for(int col=2;col<=row;col++){
                  System.out.print(col+ " ");
             }
             System.out.println();
        }
    }
    
}
