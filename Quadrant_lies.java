import java.util.Scanner;
public class Quadrant_lies {
    public static void main(String[] args) {
        System.out.println("Enter the value of x and y :");
        Scanner sc = new Scanner(System.in);
        int x= sc.nextInt();
        int y= sc.nextInt();
        if(x>0&&y>0){
           System.out.println("Co-ordinate lies in 1st quadrant and on y-axis");
        }
        else if(x<0 && y>0){
           System.out.println("Co-ordinate lies in 2nd quadrant");
        }
        else if(x<0 && y<0){
            System.out.println("Co-ordinate lies in 3rd quadrant");
        }
        else if(x>0 && y<0){
            System.out.println("Co-ordinate lies in 4th quadrant");
        }
         else if(x==0 && y==0){
            System.out.println("Lies on origin");
        }
         else if(x!=0 && y==0){
            System.out.println("Lies on x-axis");
        }

    }
    
}
