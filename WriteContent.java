package filesManipulation;
import java.util.Scanner;
import java.io.*;

class WriteContent{
    public static void main(String []args) throws IOException
    {
        File file=new File("firstText.txt");
        if(file.exists()){
                FileOutputStream output=new FileOutputStream(file);
                output.write("hello astronomers this is my first writing file problem".getBytes());
                output.close();
        }
        else{
           
            file.createNewFile();
        }
    }
}