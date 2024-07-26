import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class SetStreamsExamples {
    public static void main(String[] args){
        Set<Integer> set = new HashSet<>();
        set.add(2);
        set.add(4);
        set.add(6);
        set.add(8);
        set.add(10);
        Stream<Integer> stream = set.stream();
        stream.forEach(element->System.out.print(element+" "));
    }
}