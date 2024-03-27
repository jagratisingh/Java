import java.util.Scanner;
public class CountingValleys {
    static int counting(int n, String s) {
        int valleyCount = 0;
        int altitude = 0;
        for (int i = 0; i < n; i++) {
            char step = s.charAt(i);
            if (step == 'U') {
                altitude++;
                //check if we have reached sea level after an ascent
                if (altitude == 0) {
                    valleyCount++;
                }
            } else if (step == 'D') {
                altitude--;
            }
        }
        return valleyCount;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of steps: ");
        int n = sc.nextInt();
        sc.nextLine(); // Clear the buffer
        System.out.print("Enter Pal's path: ");
        String s = sc.nextLine();
        //n : the number of steps pal takes
        //s : a string describing his paths
        int result = counting(n, s);
        System.out.println("Number of valleys Pal traversed: " + result);

        sc.close();
    
}

}
