import java.util.Scanner;
public class area_circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius for circle:");
        double r = sc.nextDouble();
        //calculate the area of circle
        double area = 3.14*r*r;
        System.out.println("Circle of area  :"+area);
    }
}
