import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args){
        String data="Hello World.This Is File Test.";
        try(FileWriter writer=new FileWriter("TextFile.txt")){
            writer.write(data);
            System.out.println("Data Has Been Return To The File");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
