import java.util.Scanner;
public class Calculator{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter num1");
        double num1=scanner.nextDouble();
        System.out.println("Enter num2");
        double num2=scanner.nextDouble();
        System.out.println("enter the operation like +,-,*,/");
        char op=scanner.next().charAt(0);
        System.out.println(calculate(num1 , num2, op));
    }
    public static double calculate(double num1 , double num2, char operation){
        switch(operation){
            case '+':
                return num1+num2;
            case '-':
                return num1-num2;
            case '*':
                return num1*num2;
            case '/':
                return num1/num2;
            default:
                System.out.println(operation +" is not valid.");
                return -1;
        }
    }
}