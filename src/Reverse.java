public class Reverse {
    public static void main(String[] args){
        int a=123;
        int b=(a%10)*10;
        int c=a/10;
        a=c;
        b=(b+a%10)*10;
        a=c/10;
        b=(b+a%10);
        a=b;
        System.out.println(a);
    }
}
