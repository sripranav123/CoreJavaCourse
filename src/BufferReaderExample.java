import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferReaderExample {
    public static void main(String[] args){
        try(BufferedReader reader = new BufferedReader(new FileReader("TextFile.txt"))){
            String line;
            while((line= reader.readLine())!=null){
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}