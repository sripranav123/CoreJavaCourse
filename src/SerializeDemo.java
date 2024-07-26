import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeDemo {
    public static void main(String[] args) throws FileNotFoundException {
        Employee employee = new Employee(101,"john" , "frontoffice");
        try(FileOutputStream fos=new FileOutputStream("employee.ser");
            ObjectOutputStream out=new ObjectOutputStream(fos)) {
            out.writeObject(employee);
            System.out.print("Serialized Employee Object");
        } catch (IOException e) {
            e.printStackTrace();
        } ;
    }
}
