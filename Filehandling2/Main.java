package Filehandling2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) throws Exception{
        //hibernate
        //spring framework
        Address address = new Address("A-23","Delhi","New Delhi");
        Name name = new Name("Jagrati","singh","Jadon");
        String[] sub ={"English","Hindi","Maths","science"};
        Data d1 = new Data(1, name,"jahratish26@gmail.com",address,sub,89.23f);
        //Raise compile time exception
        FileOutputStream fout = new FileOutputStream("E:\\java\\Filehandling2\\Data.text");
        //to hold object class data
        ObjectOutputStream ot = new ObjectOutputStream(fout);
        //write object of data into file 
        ot.writeObject(d1);
        ot.close();
        fout.close();
        //read
        FileInputStream fin = new FileInputStream("E:\\java\\Filehandling2\\Data.text");
        ObjectInputStream oot = new ObjectInputStream(fin);
        //object obj= oot.readObject();
        //object type casting
        Data d2 =(Data)oot.readObject();
        System.out.println(d2);
        oot.close();
        fin.close();
    }
 
}
