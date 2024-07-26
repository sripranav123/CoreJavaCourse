public class StringManipulation {
    public static void main(String[] args){
        String str="madam";
        String reversed=new StringBuilder(str).reverse().toString();
        if (reversed.equals(str)){
            System.out.println("palindrome.");
        }
        else{
            System.out.println("not palinrome.");
        }
        System.out.println(reversed);
    }
}
