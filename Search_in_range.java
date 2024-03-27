import java.util.Scanner;
public class Search_in_range {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array :");
        int[] arr = new int[6];
        for(int i=0;i<arr.length;i++){
             arr[i]=sc.nextInt();
        }
        System.out.println("Enter the ranges where you want to search");
        int a= sc.nextInt();
        int b= sc.nextInt();
        System.out.println(Search(arr,a,b));

    }
    public static int Search(int[] arr,int a, int b){
          int  n = 45;
           for(int i=a;i<b;i++){
                 if(arr[i]==n)
                  {
                     return n;
                  }
           }
           return -1;
    }
}
