import java.util.*;
public class Nested2{
    public static void main(String[] args){
        for(int i=5;i>=1;i--){
            System.out.println();
            for(int j=1;j<=i;j++){
                System.out.println(j);
            }
        }
    }
}