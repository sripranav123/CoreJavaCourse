import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class Sorting {
    public static void main(String[] args) {
        int num[] = {5, 4, 8, 1, 6, 2};
        Arrays.sort(num);
        System.out.println(Arrays.toString(num));
        int index = Arrays.binarySearch(num, 6);
        System.out.println(index);
        Arrays.fill(num, 10);
        System.out.println(Arrays.toString(num));
        int a1[] = {1, 2, 3};
        int a2[] = {1, 2, 3};
        System.out.println(Arrays.equals(a1, a2));
        String fruits[] = {"apple", "banana", "cherry", "anar"};
        List<String> fruitsList = Arrays.asList(fruits);
        System.out.println(fruitsList);
        Stream<String> fruitStream = Arrays.stream(fruits);
        //fruitStream.filter(fruit -> fruit.startsWith("a") || fruit.startsWith("A"))
          //      .forEach(System.out::println);
        //fruitStream.map(String::toUpperCase)
          //      .forEach(System.out::println);
        //fruitStream.sorted()
                //.forEach(System.out::println);
        //List<String> aFruits = fruitStream.filter(fruit -> fruit.startsWith("a") || fruit.startsWith("A"))
                //.collect(Collectors.toList());
        //System.out.println(aFruits);
        //String str=fruitStream.reduce("",(a+b)->a+b);
    }
}