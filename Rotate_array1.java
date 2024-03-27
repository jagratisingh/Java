import java.util.Scanner;
public class Rotate_array1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("N is no of elements in an array:");
        int N = sc.nextInt();
        System.out.println("k is no of rotations in an array:");
        int K=  sc.nextInt();
        System.out.println("q is no of queries in an array:");
        int Q = sc.nextInt();
        int rot = K%N;
        int[] arr = new int[N];
        //getting elements in an array
        System.out.println("Enter the elements :");
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }
        //no of queries means indexing
        System.out.println("Enter the indices:");
        for(int i=0;i<Q;i++){
            int ind = sc.nextInt();
            if(ind-rot>=0){
                System.out.println(arr[ind-rot]);
            }
            else{
                System.out.println(arr[ind-rot+arr.length]);
            }
        }
    }
}
