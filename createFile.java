package filesManipulation;
import java.util.Scanner;
import java.io.*;

class createFile{
    public static void main(String[]args) throws IOException
    {
        File file=new File("firstText.txt");
        if(file.exists()){
            System.out.println("File already exists");
        }
        else{
            file.createNewFile();
        }
    }
}