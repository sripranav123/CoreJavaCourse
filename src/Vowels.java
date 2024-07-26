public class Vowels {
    public static boolean isVowel(char ch){
        String vowels="aeiouAEIOU";
        for(int i=0 ; i<vowels.length() ; i++){
            if(vowels.charAt(i)==ch)
                return true;
        }
        return false;
    }
    public static void main(String[] args){
        String str="Hello World this is java";
        String words[]=str.split("\\s+");
        for(String word:words){
            System.out.println(word);
        }
        System.out.println(words.length);
        int count=0;
        for(int i=0 ; i<str.length() ; i++){
            if(isVowel(str.charAt(i))) {
                count++;
            }
        }
        System.out.println(count);
    }
}
