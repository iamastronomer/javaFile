package filesManipulation;
import java.util.Scanner;
import java.io.*;

class ReadContent{
    public static void main(String[]args){
        File file=new File("firstText.txt");
        try{
        if(file.exists()){
            FileInputStream reader=new FileInputStream(file);
            byte array[]=new byte[(int)file.length()];
            reader.read(array);
            for(byte a:array){
                System.out.print((char)a);
            }
        }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}