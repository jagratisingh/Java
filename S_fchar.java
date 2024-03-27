import java.util.Scanner;
public class S_fchar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String :");
        String str = sc.nextLine();
        //converts given string into char array
        int[] freq = new int[str.length()];
        char string[] = str.toCharArray();
        for(int i=0;i<str.length();i++){
            freq[i]=1;
            for(int j=i+1;j<str.length();j++){
                if(string[i]==string[j]){
                    freq[i]++;
                    //Set string[j] to 0 to avoid printing visited character 
                     string[j] = '0'; 
                }
            }        
        }
        //Displays the each character and their corresponding frequency 
        System.out.println("Characters and their corresponding frequencies : "); 
         for(int i = 0; i <freq.length; i++) { 
          if(string[i] != ' ' && string[i] != '0') 
           System.out.println(string[i] + ":" + freq[i]); 

    }
    
    }
}
