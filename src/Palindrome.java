public class Palindrome {
    public static String reverse(String str){
        String reverse="";
        for(int i=str.length()-1 ; i>=0 ; i--){
            reverse+=str.charAt(i);
        }
        return reverse;
    }
    public static void main(String[] args){
        String str="Hello";
        if(str.equals(reverse(str))){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
        System.out.println(reverse(str));

    }
}
