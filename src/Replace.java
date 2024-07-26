import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class Replace {
    public static void main(String[] args) {
        String str = "Hello World this is java";
        System.out.println(str.replace("this","I")
                .replace("is","Love"));
        String replaced=str.replaceAll("\\s","_");
        System.out.println(replaced);
        Map<Character,Integer> charMap=new HashMap<>();
        for (char c:str.toCharArray()){
            charMap.put(c,charMap.getOrDefault(c,0)+1);
        }
        if(charMap.containsKey(' ')) {
            Integer values = charMap.get(' ');
            charMap.remove(' ');
            charMap.put('$',values);
        }
        System.out.println(charMap);
        int index=str.toLowerCase().indexOf("world");
        System.out.println(index);
    }
}