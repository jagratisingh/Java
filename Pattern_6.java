
public class Pattern_6 {
    public static void main(String[] args) {
        P_6(5);
    }
    public static void P_6(int n){
        for(int row=1;row<2*n;row++){
            //let's suppose n=5 and row =6 then 10-6=4 spaces will be there 
            int totalColsInRow=row>n?2*n-row:row;
            int noOfSpaces=n-totalColsInRow;//5-4=1
            for(int s=1;s<=noOfSpaces;s++)
            {
                System.out.print(" ");
            }
            for(int col=1;col<=totalColsInRow;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
            System.out.println();
        }
    }
    

