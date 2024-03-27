import java.util.Scanner;
public class Subsequences {
    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
	    String str = sc.nextLine();
	    PrintSS(str,"");
	    
		
	}
	public static void PrintSS(String ques , String ans){
	    if(ques.length()==0){
	        System.out.println(ans);
	        return;
	    }
	    char ch=ques.charAt(0);
	    //Roq = rest of question and substring(1): it will print all the string from index 1
	    String roq=ques.substring(1);
	    PrintSS(roq,ans+"");
	    PrintSS(roq,ans+ch);
	}
}
