import java.util.Arrays;

public class UsingMyInteger {
    public static void main(String[] args){
        MyInteger num1=new MyInteger(99);
        MyInteger num2=new MyInteger(75);
        MyInteger num3=new MyInteger(25);
        int i = num1.compareTo(num2);
        System.out.println(i);
        int j = num2.compareTo(num1);
        System.out.println(j);
        MyInteger[] array ={num1,num2,num3};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

    }
}
