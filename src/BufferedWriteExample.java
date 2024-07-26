import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriteExample {
    public static void main(String[] args){
        try(BufferedWriter writer=new BufferedWriter(new FileWriter("TextFile.txt"))){
            String newline="hello world";
            writer.write(newline);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
