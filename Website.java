import java.util.*;
public class Website{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String website=sc.next();
       
        if(website.endsWith(".org")){
            System.out.println("This is organisation site");
        }
            else if(website.endsWith(".com"))
            {
                System.out.println("This is commercial site");
            }
            else
                System.out.println("this is indian site");
                    
            
            
        }
    }
