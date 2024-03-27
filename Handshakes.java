import java.util.Scanner;
public class Handshakes {
    public static void main(String[] args) {
        //n= number of persons in the room
        System.out.println("Enter the n:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //for maximum no of handshakes , everyperson should handshake to each person in the room
        int handshakes;
        handshakes= (n-1)*n/2;
        System.out.println("Total number of handshakes:"+handshakes);

        
    }
    
}
