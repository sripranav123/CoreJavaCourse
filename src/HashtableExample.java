import java.util.Enumeration;
import java.util.Hashtable;

public class HashtableExample {
    public static void main(String[] args){
        Hashtable<Integer , String> myhashtable = new Hashtable<>();
        myhashtable.put(1,"red");
        myhashtable.put(2,"blue");
        myhashtable.put(3,"yellow");
        myhashtable.put(4,"green");
        Enumeration<Integer> keys= myhashtable.keys();
        while(keys.hasMoreElements()){
            Integer key= keys.nextElement();
            System.out.println(key+" value is :" + myhashtable.get(key));
        }
        Enumeration<String> values = myhashtable.elements();
        while(values.hasMoreElements()){
            System.out.println(values.nextElement());
        }
    }
}
