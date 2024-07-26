import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreeamExample {
    public static void main(String[] args) throws IOException {
        FileInputStream fis= new FileInputStream("example.txt");
        int content;
        while((content= fis.read())!=-1){
            System.out.print((char) content);
        }
        fis.close();
    }
}
