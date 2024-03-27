package filehandling;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Readfromfile {
    public static void main(String[] args) {
        try{
        File obj = new File("E:\\java\\filehandling\\file1.text");
        Scanner myReader = new Scanner(obj);
        while(myReader.hasNextLine()){
            String data = myReader.nextLine();
            System.out.println(data);
        }
        myReader.close();
    }
    catch(FileNotFoundException e){
        System.out.println("An error occured ");
        e.printStackTrace();
    }
         
    }
    
}
