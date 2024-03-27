import java.util.Scanner;
public class jump_clouds {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num of clouds");
		int n = sc.nextInt();
		System.out.println("Enter the jump distance:");
		int k = sc.nextInt();
		//enery level
		int e=100;
		int arr[] = new int[n];
		System.out.println("Enter the elements in an array:");
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i=k+i){
		    if(arr[i]==0){
		        e=e-1;
		    }
		    else
		    {
		        e=e-3;
		    }
		}
		System.out.println("Remaining energy level:"+e);
	}
}
