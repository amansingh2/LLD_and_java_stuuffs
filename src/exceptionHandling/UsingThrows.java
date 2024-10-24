package exceptionHandling;
/*


 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class UsingThrows {
    public static void main(String[] args) {
        try{
            readFile("example.txt");
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
    public static void readFile(String fileName) throws IOException{
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        String line;
        while((line = reader.readLine()) != null){
            System.out.println(line);
        }
        reader.close();
    }
}
