import java.util.*;
public class CDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string :");
        String str = sc.nextLine();
        String ans = " "+str.charAt(0);
        
        int count=1;
        for(int i=1;i<str.length();i++)
        {
              char c = str.charAt(i);
              char p = str.charAt(i-1);
              if(p==c){
                count++;
              }
              else{
                  if(count>1){
                    ans+=count;
                  }
                  count=1;
                  ans+=c;
              }
//if(count>1) ans+=count;
              
        }
        if(count>1) ans+=count;
        System.out.println(ans);
        
    }
    
}
