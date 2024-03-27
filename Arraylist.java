import java.util.ArrayList;
import java.util.Scanner;
public class Arraylist {
    public static void main(String[] args) {
        //confusion between integer and number
        ArrayList<Number> list = new ArrayList<>(10);
        Scanner sc = new Scanner(System.in);
        list.add(0,10);
        list.add(20);
        list.add(28);
        list.add(40);
        list.add(506);
        System.out.println(list);
        System.out.println(list.contains(34));
        System.out.println(list.set(2,45));
        System.out.println(list.remove(2));
        System.out.println(list);
        //input
         for(int i=0;i<5;i++){
             list.add(sc.nextInt());
        }
        for(int i=0;i<5;i++){
              System.out.println(list.get(i));
        }
        
            System.out.println(list);

    }

    
}
