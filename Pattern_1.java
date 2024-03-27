public class Pattern_1 {
    public static void main(String[] args) {
        P_1(5);
        
    }
    public static void P_1(int n){
        for(int row =1;row<=n;row++){
            //for every row , run the column
             for(int col =1;col<=row;col++){
                      System.out.print("*");
             }
             //when one row is printed we need to add a new line
             System.out.println();
             
        }
    }
}
