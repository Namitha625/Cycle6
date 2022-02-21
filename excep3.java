//FileNotFoundException
package Cycle6;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FilenotFound {
    public static void main(String args[]) throws IOException {
    try{
        FileReader fin = new FileReader("input.txt");
    }catch(FileNotFoundException e){System.out.println("File not Found in directory");} 
    }
    
}