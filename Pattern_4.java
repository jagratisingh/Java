public class Pattern_4 {
    public static void main(String[] args) {
        P_4(4);
        
    }
    public static void P_4(int n){
        for(int row =1;row<=n;row++){
            for(int col=row;col<=n;col++){
                   System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
