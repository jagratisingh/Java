public class Pattern_10 {
    public static void main(String[] args) {
        P_10(4);
    }
    public static void P_10(int n){
        int OriginalN=n;
        n=2*n;
        for(int row=0;row<=n;row++){
             for(int col=0;col<=n;col++){
                   int atEveryIndex=OriginalN- Math.min(Math.min(row,col),Math.min(n-row,n-col));
                   System.out.print(atEveryIndex+" ");
             }
             System.out.println();
        }
    }
}
