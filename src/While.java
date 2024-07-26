public class While {
    public static void main(String[] args){
        int a=12345;
        int b=0;
        while(a!=0){
            int digit=a%10;
            b=b*10+digit;
            a=a/10;
        }
        System.out.println(b);
    }
}
