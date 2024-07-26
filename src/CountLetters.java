import java.util.HashMap;
import java.util.Map;
public class CountLetters {
    public static void main(String[] args){
        String str="Hello world! this is java.";
        Map<Character,Integer> letters =new HashMap<>();
        for(char ch:str.toCharArray()){
            letters.put(ch,letters.getOrDefault(ch,0)+1);
        }
        System.out.println(letters);
    }
}