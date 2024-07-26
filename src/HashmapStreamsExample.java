import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class HashmapStreamsExample {
    public static void main(String[] args){
        Map<String,Integer> map= new LinkedHashMap<>();
        map.put("apple",3);
        map.put("grapes",1);
        map.put("papaya",4);
        map.put("orange",2);
        Map<String , Integer> filteredmap=map.entrySet().stream()
                .filter(entry->entry.getKey().startsWith("g"))
                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));
        System.out.println(filteredmap);

        Map<String,Integer> sortedMap= map.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,Map.Entry::getValue,
                        (oldValue,newValue)->oldValue,LinkedHashMap::new
                ));
        System.out.println(sortedMap);
    }
}