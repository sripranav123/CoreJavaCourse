import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class ArrayListStreams {
    public static  void main(String[] args){
        List<String> myList= new ArrayList<>();
        myList.add("Pranav");
        myList.add("Rama");
        myList.add("Srikanth");
        myList.add("Tulip");
        myList.add("Lakshman");
        myList.add("Abhi");
        myList.add("Phani");
        myList.add("Rani");
        myList.add("Anu");
        myList.stream().forEach(System.out::println);
        System.out.println(myList.stream()
                .filter(name-> name.startsWith("P")||name.endsWith("p"))
                .collect(Collectors.toList()));
        List<String> upperCaseNmaes = myList.stream().map(String::toUpperCase)
                .collect(Collectors.toList());
        upperCaseNmaes.forEach(System.out::println);
        myList.stream().sorted()
                .forEach(System.out::println);
        long count=myList.stream().count();
        System.out.println("no of names =" + count);

        List<String> firstThrreeNames=myList.stream()
                .limit(3)
                .collect(Collectors.toList());
        firstThrreeNames.forEach(System.out::println);

        String str1 = myList.stream()
                .reduce("",(a,b)->a+" "+b);
        System.out.println(str1);
        List<Integer> namesLength = myList.stream()
                .map(String::length)
                .collect(Collectors.toList());
        System.out.println("length :"+ namesLength);
        List<String> sortedNames = myList.stream()
                                .sorted((n1,n2)-> Integer.compare(n1.length(),n2.length()))
                .collect(Collectors.toList());
        sortedNames.forEach(System.out::println);
        Map<Character,List<String>> namesByFirstLetter = myList.stream()
                .collect(Collectors.groupingBy(name->name.charAt(0)));
        System.out.println(namesByFirstLetter);
    }
}
