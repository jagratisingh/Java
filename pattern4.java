import java.util.*;
public class pattern4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n :");
        int n =sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j++){
                System.out.print(j+" ");
                
            }
            System.out.println();
           // System.out.println();
        }

    }
}
