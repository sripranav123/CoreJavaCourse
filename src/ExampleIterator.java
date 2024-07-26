import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class ExampleIterator {
    public static void main(String[] args){
        Map<Integer , String> myMap= new LinkedHashMap<>();
        myMap.put(1,"red");
        myMap.put(2,"blue");
        myMap.put(3,"yellow");
        myMap.put(4,"green");
        Iterator<Integer> itr=myMap.keySet().iterator();
        while(itr.hasNext()){
            int key=itr.next();
            System.out.println(  key + "value is : " + myMap.get(key) );
        }
        for(Map.Entry<Integer , String> entry : myMap.entrySet()){
            System.out.println(entry.getKey()+" " + entry.getValue());
        }
    }
}
