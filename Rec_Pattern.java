public class Rec_Pattern {
    public static void main(String[] args) {
        Triangle(4, 0);
    }
    public static void Triangle(int r , int c){
        if(r==0){
            return;
        }
        if(c<r)
        {
            System.out.print("*");
            Triangle(r, c+1);
        }
        else
        {
            System.out.println();
            Triangle(r-1,0);
        }
    }
}
