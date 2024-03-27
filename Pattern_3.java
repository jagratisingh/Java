public class Pattern_3 {
    public static void main(String[] args) {
        P_3(5);
    }
    public static void P_3(int n){
           for(int row=1;row<=n;row++){
                for(int col = 1;col<=row;col++){
                    System.out.print(col);
                }
                System.out.println();
           }
    }
    
}
