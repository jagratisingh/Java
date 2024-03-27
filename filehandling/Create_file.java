package filehandling;
import java.io.File;//import the file class 
import java.io.IOException;//Import the IOException class to handle errors
public class Create_file {
    public static void main(String[] args) {
        try{
        File obj = new File("E:\\java\\filehandling\\file1.text");    
        if(obj.createNewFile()){ //for creating new file
             System.out.println("file created :"+obj.getName());
        }
        else
        {
            System.out.println("file already exists");
        }
    }
    catch(IOException e ){
         System.out.println("An error occured ");
         // printStackTrace() will pinpoint the exact line in which the method raised the exception.
         e.printStackTrace();//useful for diagnosing exception where the exception occurs
    }
    }
    
}
