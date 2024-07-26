import java.util.Scanner;
public class Multiplication {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter a number:");
        int num=scanner.nextInt();
        int i=1;
        do{
            int product=num*i;
            System.out.println(num+"*"+i+"="+product);
            i++;
        }
        while(i<=10);
    }
}
