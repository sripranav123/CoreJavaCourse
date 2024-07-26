import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadExample {
    public static void main(String[] args){
        try(FileReader reader=new FileReader("TextFile.txt")){
            int char1;
            while((char1=reader.read())!=-1)
                System.out.print((char)char1);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("File Not Found");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
