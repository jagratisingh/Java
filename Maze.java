public class Maze{
    public static void main(String[] args) {
        path(" ", 3,3);
        
    }
    public static int Count(int r , int c) {
        if(r==1||c==1){
             return 1;
        }
        int left= Count(r-1,c);
        int right=Count(r,c-1);
        return left + right;
        
    }
    public static void path(String p, int r , int c){
          if(r==1 || c==1){
              System.out.println(p);
              return;
          }
          if(r>1){
             path(p+'D', r-1, c);
          }
           if(c>1){
             path(p+'R', r, c-1);
          }
    }
}
