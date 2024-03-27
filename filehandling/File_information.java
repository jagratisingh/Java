package filehandling;
import java.io.File;
public class File_information {
    public static void main(String[] args) {
        File obj = new File("E:\\java\\filehandling\\file1.text");
        if(obj.exists()){
            System.out.println("file created :"+obj.getName());
            System.out.println("Absolute path :"+obj.getAbsolutePath());
            System.out.println("Readable :"+obj.canRead());
            System.out.println("Writable :"+obj.canWrite());
            System.out.println("file size in bytes :"+obj.length());
        }
        else
        {
            System.out.println("The File doesn't exist");


        }
    }
    
}
