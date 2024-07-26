public class Test {
    public static void main(String[] args){
        Test t = new Test();
        String s = "Hello";
        t.change(s);
        System.out.println(s);
        int[] arr = {10};
        t.increment(arr);
        System.out.println(arr[0]);

        String myStr = "100.989";

        Double myNum = Double.parseDouble(myStr);
        short shortValue = myNum.shortValue();
        System.out.println(shortValue);
    }
    public void change(String str){
        str = "Bye";
    }
    public void increment(int[] n){
        n[0] = n[0]+1;
    }
}
