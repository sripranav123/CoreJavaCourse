import java.io.File;
import java.io.IOException;

public class FileExample {
    public static void main(String[] args){
        File file = new File("example.txt");
        try{
            if (file.createNewFile()) {
                System.out.println("file craeted " + file.getName());
            }
            else {
                System.out.println("File Already Exists.");
            }
        }catch (IOException e){
            System.out.println("File is not created.");
            e.printStackTrace();
        }
        if(file.exists()){
            System.out.println("Absolute Path "+file.getAbsolutePath());
            System.out.println("Writable " + file.canWrite()+"   " + "Readable " + file.canRead());
            System.out.println("File Size in Bytes " + file.length());
        }
        File newFile=new File("newfile.txt");
        boolean flag = file.renameTo(newFile);
        if(flag){
            System.out.println("New File Name is " + newFile.getName());
        }
    }
}
