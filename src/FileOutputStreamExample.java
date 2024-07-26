import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FileOutputStreamExample {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("example.txt");
        String data="Hello World";
        fos.write(data.getBytes());
        System.out.println("Data Return To File.");
        fos.close();
    }
}
