import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args){
        List<String> myList=new ArrayList<>();
        myList.add("pranav");
        myList.add("Rama");
        myList.add("Srikanth");
        String str=myList.get(2);
        System.out.println(str);
        for(String str1 : myList)
            System.out.println(str1);
        myList.remove("pranav");
        System.out.println(myList.size());


    }
}
