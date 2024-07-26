import java.util.Scanner;
public class Month{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter num1");
        int num1=scanner.nextInt();
        number(num1);
    }
    public static void number(int num1){
        switch(num1){
            case 1:
                System.out.println("january");
                return;
            case 2:
                System.out.println("febraury");
                return;
            case 3:
                System.out.println("march");
                return;
            case 4:
                System.out.println("april");
                return;
            case 5:
                System.out.println("may");
                return;
            case 6:
                System.out.println("june");
                return;
            case 7:
                System.out.println("july");
                return;
            case 8:
                System.out.println("august");
                return;
            case 9:
                System.out.println("september");
                return;
            case 10:
                System.out.println("october");
                return;
            case 11:
                System.out.println("november");
                return;
            case 12:
                System.out.println("december");
                return;
            default:
                System.out.println("invalid number. ");
        }
    }
}
