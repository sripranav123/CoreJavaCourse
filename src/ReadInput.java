import java.util.Scanner;

public class ReadInput {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        //System.out.println("Enter a Number: ");
        //int num = scanner.nextInt();
        //System.out.println(num);
        System.out.println("Enter a String: ");
        String line = scanner.nextLine();
        System.out.println(line+" enter a number now:");
        int num = scanner.nextInt();
        System.out.println(num);

    }
}
