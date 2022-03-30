package filesManipulation;
import java.util.Scanner;
import java.io.*;

class WriteBuffer
{
    public static void main(String [] args) throws IOException{
               File file=new File("bufferText.txt");
               if(file.exists()){
                   BufferedWriter writer=new BufferedWriter(new FileWriter(file));
                   writer.write("writing content usig buffer writer");
                   writer.close();
                   BufferedReader reader=new BufferedReader(new FileReader(file));
                   System.out.println(reader.readLine());
               }
               else{
                   file.createNewFile();
               }
    }
}