import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.Vector;

public class MaxInVector {
    public static void main(String[] args){
        List<Integer> v=new Vector<>();
        v.add(81);
        v.add(23);
        v.add(67);
        v.add(56);
        v.add(45);
        //Integer.compare()
        Optional<Integer> large = v.stream().max(Integer::compareTo);
        large.ifPresent(max->System.out.println(max));
        int largest = Collections.max(v);
        System.out.println(largest);
    }
}
