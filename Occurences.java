import java.util.Scanner;
public class Occurences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr ={ 1,2,2,2,3,4,5,6};
        System.out.println("Enter the element for calulating number of occurences:");
        int x = sc.nextInt();
        int res=0;
        for(int i=0;i<arr.length;i++){
            if(x==arr[i]){
              res++;
            }
        }
        System.out.println("x is " +res+" times in an array");

    }
}
