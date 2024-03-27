public class Pattern_2 {
    public static void main(String[] args) {
        P_2(5);
        
    }
    public static void P_2(int n){
        for(int row=1;row<=n;row++){
            for(int col=1;col<=n;col++){
                 System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
