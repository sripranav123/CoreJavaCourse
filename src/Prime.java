public class Prime {
    public static void main(String[] args) {
        int num = 12;
        boolean flag = true;
        for(int i=2 ; i<=num ; i++){
            if(num%2==0){
                flag=false;
                break;
            }
        }
        if (flag){
            System.out.println(num +" is prime");
        }
        else{
            System.out.println(num +" is not prime");
        }

    }
}
