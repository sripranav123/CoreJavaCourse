import java.util.HashSet;
import java.util.Set;

public class UsingSet {
    public static void main(String[] args){
        Set<Integer> mySet = new HashSet<>();
        mySet.add(11);
        mySet.add(11);
        mySet.add(12);
        mySet.add(16);
        mySet.add(14);
        mySet.add(15);
        System.out.println(mySet);
    }
}
