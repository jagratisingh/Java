package filehandling;
import java.io.FileWriter;
import java.io.IOException;
public class Write_file {
    public static void main(String[] args) {
        try{
        FileWriter myWriter = new FileWriter("E:\\java\\filehandling\\file1.text");
        myWriter.write("Java is a prominent programming language ");
        // myWriter.write("Java is not that much prominent programming language ");

       // The close() method of FileOutputStream class is used to close the file output stream 
       //and releases all system resources associated with this stream.
        myWriter.close();
        System.out.println("Successfully wrote into the file");
    }
    catch(IOException e){
        System.out.println("An error occured");
        e.printStackTrace();
    }
}
    
}
