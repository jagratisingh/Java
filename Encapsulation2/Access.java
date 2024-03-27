package Encapsulation2;
import java.util.Scanner;
public class Access {
    public static void main(String[] args) {
        User u[] = new User[5]; 
        //Take user input using encapsulation
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter the values and name :");
         for(int i=0;i<u.length;i++){
            int id = sc.nextInt();
             sc.nextLine();
             String name = sc.nextLine();
             u[i]=new User(name,id);
        }
        for(int i=0;i<u.length;i++){
            System.out.println("Id : "+u[i].getId());
            System.out.println("name :"+u[i].getName());
        }

    }
}
