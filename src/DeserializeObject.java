import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeObject {
    public static void main(String[] args) throws FileNotFoundException {
        Employee employee = null;
        try(FileInputStream fis = new FileInputStream("Employee.ser");
            ObjectInputStream in=new ObjectInputStream(fis)) {
            employee = (Employee) in.readObject();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        System.out.println(employee);
    }
}
